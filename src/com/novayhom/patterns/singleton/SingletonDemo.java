package com.novayhom.patterns.singleton;

public enum SingletonDemo {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
