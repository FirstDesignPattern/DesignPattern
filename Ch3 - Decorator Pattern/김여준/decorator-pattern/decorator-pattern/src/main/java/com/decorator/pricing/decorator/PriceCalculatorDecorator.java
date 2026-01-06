package com.decorator.pricing.decorator;

import com.decorator.pricing.PriceCalculator;

public abstract class PriceCalculatorDecorator implements PriceCalculator {
    protected final PriceCalculator delegate;

    protected PriceCalculatorDecorator(PriceCalculator delegate) {
        this.delegate = delegate;
    }
}
