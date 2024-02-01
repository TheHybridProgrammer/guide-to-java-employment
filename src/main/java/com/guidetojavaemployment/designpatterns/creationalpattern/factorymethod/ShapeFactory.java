package com.guidetojavaemployment.designpatterns.creationalpattern.factorymethod;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            default -> throw new IllegalArgumentException(String.format("Shape %s not allowed", shapeType));
        };
    }
}
