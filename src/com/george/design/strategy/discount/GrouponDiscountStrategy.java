package com.george.design.strategy.discount;

public class GrouponDiscountStrategy implements DisCountStrategy {
    @Override
    public double calcDisCount(Order order) {
        return order.getPrice() * 0.8;
    }
}
