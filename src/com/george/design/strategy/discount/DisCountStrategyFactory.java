package com.george.design.strategy.discount;

import java.util.HashMap;
import java.util.Map;

public class DisCountStrategyFactory {
    private static final Map<OrderType, DisCountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DisCountStrategy getDisCountStrategy(OrderType orderType) {
        return strategies.get(orderType);
    }

}
