package com.guidetojavaemployment.practice.streams;

import java.util.List;

public class BasicStream {

    public void toListPrint(List<String> someStrings) {
        // Wrong
        someStrings.stream()
                .forEach(System.out::println);
        someStrings.forEach(System.out::println);
    }


    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number%2 == 0)
                .toList();
    }

    public List<String> toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public int sum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (total, element) -> total + element);
    }

}
