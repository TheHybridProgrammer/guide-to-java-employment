package com.guidetojavaemployment.designpatterns.creationalpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingletonTest {

    @Test
    void shouldGetSingletonInstance() {
        Singleton singleton = Singleton.getInstance();

        assertThat(singleton.getMessage()).isEqualTo("Singleton message");
    }

}