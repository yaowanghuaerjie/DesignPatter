package com.george.design.observerpatter.example;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private UserService userService = new UserService();
    private List<RegObserver> observerList = new ArrayList<>();

    public UserController() {
        observerList.add(new RegPromotionObserver(new PromotionService()));
        observerList.add(new RegNotificationObserver(new NotificationService()));
    }

    public void register() {
        long userId = userService.register("george", "111111");
        for (RegObserver regObserver : observerList) {
            regObserver.handleRegSuccess(userId);
        }
    }
}
