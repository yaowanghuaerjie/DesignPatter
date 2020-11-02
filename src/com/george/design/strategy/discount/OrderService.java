package com.george.design.strategy.discount;

public class OrderService {
    public double disCount(Order order) {
        OrderType orderType = order.getOrderType();
        DisCountStrategy disCountStrategy = DisCountStrategyFactory.getDisCountStrategy(orderType);
        return disCountStrategy.calcDisCount(order);
    }
}
