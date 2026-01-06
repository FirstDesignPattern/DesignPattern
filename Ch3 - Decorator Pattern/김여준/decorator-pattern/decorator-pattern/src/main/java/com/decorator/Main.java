package com.decorator;

import com.decorator.domain.Cart;
import com.decorator.domain.Money;
import com.decorator.pricing.BaseItemsCalculator;
import com.decorator.pricing.PriceCalculator;
import com.decorator.pricing.decorator.CouponDecorator;
import com.decorator.pricing.decorator.PointsDecorator;
import com.decorator.pricing.decorator.VipDiscountDecorator;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(
                new Money(48_000),  // 상품합계
                true,               // VIP
                new Money(2_000),   // 정액쿠폰 2천원
                10,                 // 정률쿠폰 10%
                new Money(3_000)    // 포인트 3천원 사용
        );

        // 조립 순서가 곧 "정책 적용 순서"
        PriceCalculator calculator =
                    new PointsDecorator(
                            new CouponDecorator(
                                    new VipDiscountDecorator(
                                            new BaseItemsCalculator()
                                    )
                            )
                );

        Money finalPrice = calculator.calculate(cart);

        System.out.println(finalPrice);
    }
}