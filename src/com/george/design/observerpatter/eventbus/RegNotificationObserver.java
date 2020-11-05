package com.george.design.observerpatter.eventbus;

public class RegNotificationObserver {
    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @Subscribe
    public void handleRegSuccess(Long userId){
        notificationService.sendInBoxMessage(userId);
    }
}
