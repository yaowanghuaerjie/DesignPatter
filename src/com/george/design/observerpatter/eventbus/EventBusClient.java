package com.george.design.observerpatter.eventbus;

import java.util.ArrayList;
import java.util.List;

public class EventBusClient {
    public static void main(String[] args) {
        UserController userController = new UserController();
        RegNotificationObserver regNotificationObserver = new RegNotificationObserver(new NotificationService());
        RegPromotionObserver regPromotionObserver = new RegPromotionObserver(new PromotionService());
        List<Object> objectList = new ArrayList<>();
        objectList.add(regNotificationObserver);
        objectList.add(regPromotionObserver);
        userController.setRegObservers(objectList);
        userController.register("1603333333", "123456");
    }
}
