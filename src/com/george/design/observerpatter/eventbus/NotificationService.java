package com.george.design.observerpatter.eventbus;

public class NotificationService {
    public void sendInBoxMessage(long userId) {
        System.out.println("恭喜您注册成功，userId：" + userId + "  Thead:" + Thread.currentThread().getName());
    }
}
