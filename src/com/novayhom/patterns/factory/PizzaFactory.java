package com.novayhom.patterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;

        switch (type) {
            case "cheese":
                p = new CheesePizza();break;
            case "chicken":
                p = new ChickenPizza();break;
            case "veggie":
                p = new VeggiePizza();break;
            default:
                System.out.println("no match");
        }
        return p;
    }
}
