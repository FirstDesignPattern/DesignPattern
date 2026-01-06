package com.decorator.pricing;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;

public interface PriceCalculator {
    Money calculate(Cart cart);
}