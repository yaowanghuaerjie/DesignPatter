package com.george.design.observerpatter.example;

public class NotificationService {
    public void sendInBoxMessage(long userId) {
        System.out.println("恭喜" + userId + "用户注册成功");
    }
}
