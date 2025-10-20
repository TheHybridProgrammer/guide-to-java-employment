package com.guidetojavaemployment.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void average() {
        List<Integer> numbres = List.of(5, 7, 9);
        double sum = Average.calculateAverage(numbres);
        assertThat(sum).isEqualTo(7);
    }
}