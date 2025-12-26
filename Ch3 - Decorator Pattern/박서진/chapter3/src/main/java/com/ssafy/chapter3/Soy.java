package com.ssafy.chapter3;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 소이밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
