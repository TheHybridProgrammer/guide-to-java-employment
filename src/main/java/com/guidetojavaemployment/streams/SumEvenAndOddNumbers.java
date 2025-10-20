package com.guidetojavaemployment.streams;

import java.util.List;

public class SumEvenAndOddNumbers {

    public static int sumEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number / 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
