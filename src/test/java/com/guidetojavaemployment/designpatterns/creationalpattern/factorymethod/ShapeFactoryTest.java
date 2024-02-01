package com.guidetojavaemployment.designpatterns.creationalpattern.factorymethod;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ShapeFactoryTest {

    @Test
    void shouldReturnCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");

        assertThat(circle.draw()).isEqualTo("Circle");
    }

    @Test
    void shouldReturnRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("Rectangle");

        assertThat(rectangle.draw()).isEqualTo("Rectangle");
    }

    @Test
    void shouldThrowExceptionOnUnknownShape() {
        ShapeFactory shapeFactory = new ShapeFactory();

        assertThatThrownBy(() -> shapeFactory.createShape("Triangle"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Shape Triangle not allowed");
    }
}
