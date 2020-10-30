package com.george.design.observerpatter;

public class RegPromotionObserver {
    private PromotionService promotionService;

    public RegPromotionObserver() {
        promotionService = new PromotionService();
    }
    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println("handleRegSuccess...");
        promotionService.isSueNewUserExperienceCash(userId);
    }
}
