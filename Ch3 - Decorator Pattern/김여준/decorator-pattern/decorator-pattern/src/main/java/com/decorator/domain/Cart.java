package com.decorator.domain;

import java.util.Objects;

public class Cart {
    private final Money itemsTotal;      // 상품 합계
    private final boolean vip;           // VIP 여부
    private final Money couponAmount;    // 정액 쿠폰(없으면 0)
    private final int couponPercent;     // 정률 쿠폰(없으면 0)
    private final Money pointsToUse;     // 사용할 포인트

    public Cart(Money itemsTotal, boolean vip,
                Money couponAmount, int couponPercent, Money pointsToUse) {
        this.itemsTotal = Objects.requireNonNull(itemsTotal);
        this.vip = vip;
        this.couponAmount = Objects.requireNonNull(couponAmount);
        this.couponPercent = couponPercent;
        this.pointsToUse = Objects.requireNonNull(pointsToUse);
    }

    public Money itemsTotal() { return itemsTotal; }
    public boolean isVip() { return vip; }
    public Money couponAmount() { return couponAmount; }
    public int couponPercent() { return couponPercent; }
    public Money pointsToUse() { return pointsToUse; }
}
