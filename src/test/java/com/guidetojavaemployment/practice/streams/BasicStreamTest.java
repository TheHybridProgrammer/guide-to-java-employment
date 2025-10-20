package com.guidetojavaemployment.practice.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

class BasicStreamTest {

    BasicStream basicStream = new BasicStream();

    @Test
    void toListPrint() {
        List<String> someStrings = List.of("el1", "el2");
        basicStream.toListPrint(someStrings);
    }

    @Test
    void filterEvenNumbers() {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6, 8);
        System.out.println(basicStream.filterEvenNumbers(numbers));
    }

    @Test
    void toUpperCase() {
        List<String> words = List.of("Kartof", "potato", "POMME DE TERRE", "eartH Bonger");
        System.out.println(basicStream.toUpperCase(words));
    }

    @Test
    void sum() {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6, 8);
        System.out.println(basicStream.sum(numbers));
    }
}