package com.guidetojavaemployment.streams;

import java.util.List;

public class DuplicatesRemoval {

    public List<String> removeDuplicates(List<String> input) {
        return input.stream()
                .distinct()
                .toList();
    }
}
