package com.factory;

import com.factory.order.BusanPizzaStore;
import com.factory.order.PizzaStore;
import com.factory.order.SeoulPizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore seoulStore = new SeoulPizzaStore();
        PizzaStore busanStore = new BusanPizzaStore();

        seoulStore.orderPizza("cheese");
        busanStore.orderPizza("pepperoni");
    }
}