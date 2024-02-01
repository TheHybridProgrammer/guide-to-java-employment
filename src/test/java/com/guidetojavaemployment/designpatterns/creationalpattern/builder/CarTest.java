package com.guidetojavaemployment.designpatterns.creationalpattern.builder;

import com.guidetojavaemployment.designpatterns.creationalpattern.builder.Car.CarBuilder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CarTest {

    private static final String BRAND = "Hyundai";
    private static final String MODEL = "XM";
    private static final int YEAR = 2;
    private static final String COLOR = "RED";


    @Test
    void shouldConstructCarWithBuilder() {
        Car expected = new Car(BRAND, MODEL, YEAR, COLOR);
        Car actual = new CarBuilder().brand(BRAND)
                                     .model(MODEL)
                                     .year(2)
                                     .color(COLOR)
                                     .build();

        assertThat(actual).isEqualTo(expected);
    }
}