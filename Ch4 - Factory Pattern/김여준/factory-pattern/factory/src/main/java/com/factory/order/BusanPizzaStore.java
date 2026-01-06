package com.factory.order;

import com.factory.pizza.CheesePizza;
import com.factory.pizza.PepperoniPizza;
import com.factory.pizza.Pizza;
import com.factory.pizza.VeggiePizza;

public class BusanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese"    -> new CheesePizza("[부산식]");
            case "pepperoni" -> new PepperoniPizza("[부산식]");
            case "veggie"    -> new VeggiePizza("[부산식]");
            default -> throw new IllegalArgumentException("없는 피자 타입: " + type);
        };
    }
}
