package com.guidetojavaemployment.designpatterns.structuralpattern.proxy;

public class ProxyedClass implements ProxyInterface {

    private final String proxyMessage;

    public ProxyedClass(String proxyMessage) {
        this.proxyMessage = proxyMessage;
    }

    @Override
    public String proxyStuff() {
        return proxyMessage;
    }
}
