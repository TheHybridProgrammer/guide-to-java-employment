package com.guidetojavaemployment.designpatterns.structuralpattern.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecoratorTest {

    private static final String SIMPLE_COFFEE = "Simple Coffee";
    private static final double BASE_COST = 2.0;

    @Test
    void shouldGetSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();

        assertThat(coffee.getDescription()).isEqualTo(SIMPLE_COFFEE);
        assertThat(coffee.getCost()).isEqualTo(BASE_COST);
    }

    @Test
    void shouldGetCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();
        Coffee milkCoffee = new MilkDecorator(coffee);

        assertThat(milkCoffee.getDescription()).isEqualTo(SIMPLE_COFFEE + " but with milk");
        assertThat(milkCoffee.getCost()).isEqualTo(BASE_COST + 1.0);
    }

    @Test
    void shouldGetCoffeeWithSugar() {
        Coffee coffee = new SimpleCoffee();
        Coffee sugarCoffee = new SugarDecorator(coffee);

        assertThat(sugarCoffee.getDescription()).isEqualTo(SIMPLE_COFFEE + " but with sugar");
        assertThat(sugarCoffee.getCost()).isEqualTo(BASE_COST + 0.5);
    }

    @Test
    void shouldGetCoffeeWithMilkAndSugar() {
        Coffee coffee = new SimpleCoffee();
        Coffee milkSugarCoffee = new MilkDecorator(new SugarDecorator(coffee));

        assertThat(milkSugarCoffee.getDescription()).isEqualTo(SIMPLE_COFFEE + " but with sugar" + " but with milk");
        assertThat(milkSugarCoffee.getCost()).isEqualTo(BASE_COST + 1.0 + 0.5);
    }

}