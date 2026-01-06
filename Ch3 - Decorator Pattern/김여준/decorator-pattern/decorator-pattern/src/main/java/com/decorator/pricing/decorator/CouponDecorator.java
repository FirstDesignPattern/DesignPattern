package com.decorator.pricing.decorator;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;
import com.decorator.pricing.PriceCalculator;

public class CouponDecorator extends PriceCalculatorDecorator{
    public CouponDecorator(PriceCalculator delegate) {
        super(delegate);
    }

    @Override
    public Money calculate(Cart cart) {
        Money current = delegate.calculate(cart);

        if (cart.couponPercent() > 0) {
            current = current.percentOff(cart.couponPercent());
        }
        if (cart.couponAmount().won() > 0) {
            current = current.minus(cart.couponAmount());
        }
        return current;
    }
}
