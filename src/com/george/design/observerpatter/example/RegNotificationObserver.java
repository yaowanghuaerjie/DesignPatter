package com.george.design.observerpatter.example;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInBoxMessage(userId);
    }
}
