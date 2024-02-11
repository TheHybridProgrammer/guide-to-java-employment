package com.guidetojavaemployment.designpatterns.structuralpattern.decorator;

public class SugarDecorator implements CoffeeDecorator {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " but with sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
