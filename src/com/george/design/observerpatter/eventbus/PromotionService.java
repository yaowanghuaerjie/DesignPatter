package com.george.design.observerpatter.eventbus;

public class PromotionService {
    public void issueNewUserExperienceCash(long userId) {
        System.out.println("已为userId：" + userId + "的用户发放体验金10000" + "  Thead:" + Thread.currentThread().getName());
    }
}
