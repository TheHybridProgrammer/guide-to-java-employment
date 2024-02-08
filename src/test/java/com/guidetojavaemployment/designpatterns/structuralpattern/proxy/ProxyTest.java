package com.guidetojavaemployment.designpatterns.structuralpattern.proxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ProxyTest {

    @Test
    void shouldProxySuccesfully() {
        ProxyedClass proxyedClass = new ProxyedClass("proxy message");

        Proxy proxy = new Proxy(proxyedClass);

        assertThat(proxy.proxyStuff()).isEqualTo("proxy message");
    }

    @Test
    void shouldThrowOnIncorrectProxyMessage() {
        ProxyedClass proxyedClass = new ProxyedClass("Some message");

        Proxy proxy = new Proxy(proxyedClass);

        assertThatThrownBy(proxy::proxyStuff)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Not the correct proxy message!");
    }
}