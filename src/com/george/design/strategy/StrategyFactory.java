package com.george.design.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getNoStateStragegy(String type) {
        if (null == type || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty");
        }
        return strategies.get(type);
    }

    public static Strategy getStateStragegy(String type) {
        if (null != type || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if ("A".equals(type)) {
            return new ConcreteStrategyA();
        } else if ("B".equals(type)) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
