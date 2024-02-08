package com.guidetojavaemployment.designpatterns.structuralpattern.proxy;

import java.util.Objects;

class Proxy implements ProxyInterface {
    private final ProxyedClass proxyedClass;

    public Proxy(ProxyedClass proxyedClass) {
        this.proxyedClass = proxyedClass;
    }

    @Override
    public String proxyStuff() {
        String result = proxyedClass.proxyStuff();

        if (!Objects.equals(result, "proxy message")) {
            throw new IllegalArgumentException("Not the correct proxy message!");
        }
        return result;
    }
}
