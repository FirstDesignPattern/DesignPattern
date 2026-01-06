package com.factory.order;

import com.factory.pizza.CheesePizza;
import com.factory.pizza.PepperoniPizza;
import com.factory.pizza.Pizza;
import com.factory.pizza.VeggiePizza;

public class SeoulPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese"    -> new CheesePizza("[서울식]");
            case "pepperoni" -> new PepperoniPizza("[서울식]");
            case "veggie"    -> new VeggiePizza("[서울식]");
            default -> throw new IllegalArgumentException("없는 피자 타입: " + type);
        };
    }
}
