package com.guidetojavaemployment.designpatterns.structuralpattern.decorator;

public class MilkDecorator implements CoffeeDecorator {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDescription() {
        return coffee.getDescription() + " but with milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}
