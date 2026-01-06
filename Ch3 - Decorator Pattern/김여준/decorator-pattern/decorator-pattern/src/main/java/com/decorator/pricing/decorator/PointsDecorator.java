package com.decorator.pricing.decorator;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;
import com.decorator.pricing.PriceCalculator;

public class PointsDecorator extends PriceCalculatorDecorator{
    public PointsDecorator(PriceCalculator delegate) {
        super(delegate);
    }

    @Override
    public Money calculate(Cart cart) {
        Money current = delegate.calculate(cart);
        if (cart.pointsToUse().won() <= 0) return current;
        return current.minus(cart.pointsToUse());
    }
}
