package com.george.design.strategy.discount;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setName("华为Mate40");
        order.setOrderType(OrderType.NORMAL);
        order.setPrice(5000d);
        OrderService orderService = new OrderService();
        double disCountPrice = orderService.disCount(order);
        System.out.println("最终售价为：" + disCountPrice);
    }
}
