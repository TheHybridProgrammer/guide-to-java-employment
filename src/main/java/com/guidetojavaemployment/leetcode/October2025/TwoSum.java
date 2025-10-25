package com.guidetojavaemployment.leetcode.October2025;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // beats 47.81%, 32ms
    // beats 5.24%, 45.42 MB
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int firstNumber = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int secondNumber = nums[j];
                if (firstNumber + nums[j] == target) {
                    return new int[]{firstNumber, secondNumber};
                }
            }
        }
        return new int[]{};
    }

    // beats 99.03%, 2ms
    // beats 10.06%, 45.34 MB
    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> indexByComplement = new HashMap<>();
        indexByComplement.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int expectedComplement = target - nums[i];
            if (indexByComplement.containsKey(expectedComplement)) {
                return new int[]{indexByComplement.get(expectedComplement), i};
            }
            indexByComplement.put(nums[i], i);
        }
        return new int[]{};
    }

    // beats 99.03%, 2ms
    // beats 32.70%, 45.16 MB
    public int[] twoSumHashMostOptimalNotThinkedByMe(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
