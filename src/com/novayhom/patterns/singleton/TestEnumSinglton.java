package com.novayhom.patterns.singleton;

public class TestEnumSinglton {
    public static void main(String[] args) {
        SingletonDemo instance = SingletonDemo.INSTANCE;
        System.out.println(instance.getName());

        instance.setName("Houssam");
        System.out.println(instance.getName());
    }
}
