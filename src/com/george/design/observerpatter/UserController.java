package com.george.design.observerpatter;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {
    public UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 10;

    public UserController() {
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
        userService = new UserService();
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String passowrd) {
        long userId = userService.register(telephone, passowrd);
        System.out.println("userId: " + userId);
        return userId;
    }

    public void post(Object object){
        eventBus.post(object);
    }


}
