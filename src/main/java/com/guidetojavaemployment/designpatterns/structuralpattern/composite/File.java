package com.guidetojavaemployment.designpatterns.structuralpattern.composite;

public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "File: " + name;
    }
}
