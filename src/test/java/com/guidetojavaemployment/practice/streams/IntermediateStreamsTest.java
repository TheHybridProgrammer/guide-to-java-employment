package com.guidetojavaemployment.practice.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateStreamsTest {

    IntermediateStreams intermediateStreams = new IntermediateStreams();

    @Test
    void longestString() {
        List<String> words = List.of("Kartof", "potato", "POMME DE TERRE", "eartH Bonger");
        System.out.println(intermediateStreams.longestString(words));
    }

    @Test
    void groupByCharacter() {
        List<String> words = List.of("apple", "banana", "avocado", "blueberry", "cherry", "apricot", "cranberry");
        System.out.println(intermediateStreams.groupByCharacter(words));
    }

    @Test
    void reverseList() {
        List<Integer> numbers = List.of(3, 7, 8, 5, 1, 10);
        System.out.println(intermediateStreams.reverseIntegers(numbers));
    }

    @Test
    void duplicates() {
        List<Integer> numbers = List.of(3, 7, 3, 5, 1, 7);
        System.out.println(intermediateStreams.getDuplicates(numbers));
    }

}