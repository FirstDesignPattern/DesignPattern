package com.decorator.domain;

public class Money {
    private final long won;

    public Money(long won) {
        if (won < 0) throw new IllegalArgumentException("Money cannot be negative");
        this.won = won;
    }

    public long won() { return won; }

    public Money plus(Money other) {
        return new Money(this.won + other.won);
    }

    public Money minus(Money other) {
        long res = this.won - other.won;
        return new Money(Math.max(res, 0));
    }

    public Money percentOff(int percent) {
        if (percent < 0 || percent > 100) throw new IllegalArgumentException("percent must be 0..100");
        long discounted = this.won * (100L - percent) / 100L;
        return new Money(discounted);
    }

    public Money multiply(double factor) {
        return new Money(Math.round(this.won * factor));
    }

    @Override public String toString() { return won + "원"; }
}
