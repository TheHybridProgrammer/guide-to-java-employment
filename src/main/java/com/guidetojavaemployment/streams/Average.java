package com.guidetojavaemployment.streams;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class Average {

    public static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}
