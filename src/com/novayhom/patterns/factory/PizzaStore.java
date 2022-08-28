package com.novayhom.patterns.factory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cute();

        return pizza;
    }
}
