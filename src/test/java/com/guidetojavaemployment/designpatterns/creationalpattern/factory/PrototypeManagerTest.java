package com.guidetojavaemployment.designpatterns.creationalpattern.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrototypeManagerTest {

    @Test
    void shouldGetPrototypes() {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        ConcretePrototype prototype2 = new ConcretePrototype("Prototype 2");
        PrototypeManager manager = new PrototypeManager();
        manager.addPrototype("1", prototype1);
        manager.addPrototype("2", prototype2);

        Prototype clonedPrototype1 = manager.getPrototype("1");
        Prototype clonedPrototype2 = manager.getPrototype("2");

        assertThat(clonedPrototype1).isEqualTo(prototype1);
        assertThat(clonedPrototype2).isEqualTo(prototype2);
    }

}