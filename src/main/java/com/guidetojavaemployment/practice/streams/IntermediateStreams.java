package com.guidetojavaemployment.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class IntermediateStreams {

    public String longestString(List<String> words) {
        return words.stream()
                .max(Comparator.comparing(String::valueOf))
                .get();
    }

    public Map<Character, List<String>> groupByCharacter(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
    }

    public List<Integer> reverseIntegers(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public List<Integer> getDuplicates(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream()
                .filter(element -> !seen.add(element))
                .toList();
    }
}
