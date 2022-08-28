package com.novayhom.patterns.factory;

public class CheesePizza implements  Pizza {

    public CheesePizza() {
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza ✔");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza ✔");

    }

    @Override
    public void cute() {
        System.out.println("Cutting Cheese Pizza ✔");

    }
}
