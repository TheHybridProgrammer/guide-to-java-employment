package com.guidetojavaemployment.designpatterns.creationalpattern.builder;

import java.util.Objects;

public class Car {

    private final String brand;
    private final String model;
    private final Integer year;
    private final String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    static public class CarBuilder {

        private String brand;
        private String model;
        private Integer year;
        private String color;

        CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        CarBuilder year(Integer year) {
            this.year = year;
            return this;
        }

        CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            return new Car(brand, model, year, color);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
