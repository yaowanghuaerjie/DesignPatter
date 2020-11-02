package com.george.design.strategy.discount;

public class NormalDiscountStrategy implements DisCountStrategy {
    @Override
    public double calcDisCount(Order order) {
        return order.getPrice();
    }
}
