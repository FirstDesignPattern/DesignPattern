package com.factory.order;

import com.factory.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("주문 완료: " + pizza.getName());
        return pizza;
    }
}
