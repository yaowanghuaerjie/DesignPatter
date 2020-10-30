package com.george.design.observerpatter;

import java.util.ArrayList;
import java.util.List;

public class TestClient {
    public static void main(String[] args) {
        UserController userController = new UserController();
        List<Object> observers = new ArrayList<>();
        observers.add(new RegPromotionObserver());
        userController.setRegObservers(observers);
        userController.register("16033333333","123456");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        userController.post(observers.get(0));
    }
}
