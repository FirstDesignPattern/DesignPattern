package com.decorator.pricing;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;

public class BaseItemsCalculator implements PriceCalculator {
    @Override
    public Money calculate(Cart cart) {
        return cart.itemsTotal();
    }
}
