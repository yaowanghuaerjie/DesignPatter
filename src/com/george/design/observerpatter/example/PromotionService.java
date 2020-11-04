package com.george.design.observerpatter.example;

public class PromotionService {
    public void issueNewUserExperienceCash(long userId) {
        System.out.println("向" + userId + "用户发放1000000模拟币");
    }
}
