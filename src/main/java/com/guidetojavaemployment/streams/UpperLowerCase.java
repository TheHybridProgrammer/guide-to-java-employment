package com.guidetojavaemployment.streams;

import java.util.List;

public class UpperLowerCase {

    public static List<String> toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public static List<String> toLowerCase(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .toList();
    }
}