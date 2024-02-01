package com.guidetojavaemployment.designpatterns.creationalpattern.factory;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private final Map<String, Prototype> prototypes;

    public PrototypeManager() {
        this.prototypes = new HashMap<>();
    }

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        if (prototypes.containsKey(key)) {
            return prototypes.get(key);
        }
        return null;
    }
}
