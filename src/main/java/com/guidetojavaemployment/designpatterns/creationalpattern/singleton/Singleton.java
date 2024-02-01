package com.guidetojavaemployment.designpatterns.creationalpattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return "Singleton message";
    }
}
