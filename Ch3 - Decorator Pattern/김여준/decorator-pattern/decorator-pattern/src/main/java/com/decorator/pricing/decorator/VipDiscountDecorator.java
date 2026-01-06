package com.decorator.pricing.decorator;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;
import com.decorator.pricing.PriceCalculator;

public class VipDiscountDecorator extends PriceCalculatorDecorator{
    public VipDiscountDecorator(PriceCalculator delegate) {
        super(delegate);
    }

    @Override
    public Money calculate(Cart cart) {
        Money current = delegate.calculate(cart);
        if (!cart.isVip()) return current;
        return current.percentOff(5);
    }
}
