package com.novayhom.patterns.factory;

public class VeggiePizza implements Pizza {

    public VeggiePizza() {
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza ✔");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza ✔");

    }

    @Override
    public void cute() {
        System.out.println("Cutting Veggie Pizza ✔");

    }
}

