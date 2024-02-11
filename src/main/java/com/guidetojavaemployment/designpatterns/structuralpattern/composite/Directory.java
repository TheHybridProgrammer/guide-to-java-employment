package com.guidetojavaemployment.designpatterns.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public String showDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Directory: ").append(name).append("\n");
        details.append("Contents:\n");
        for (FileSystemComponent component : components) {
            details.append(component.showDetails());
        }
        return details.toString();
    }
}
