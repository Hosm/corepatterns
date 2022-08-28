package com.novayhom.patterns.factory;

public class ChickenPizza implements  Pizza {
    public ChickenPizza() {
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza ✔");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicken Pizza ✔");

    }

    @Override
    public void cute() {
        System.out.println("Cutting Chicken Pizza ✔");

    }
}
