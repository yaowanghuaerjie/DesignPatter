package com.george.design.observerpatter.eventbus;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {
    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        userService = new UserService();
        eventBus = new AsynvEventBus(Executors.newSingleThreadExecutor());
        //eventBus = new AsynvEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object object : observers) {
            eventBus.register(object);
        }
    }

    public Long register(String telePhone, String password) {
        long userId = userService.register(telePhone, password);
        eventBus.post(userId);
        return userId;
    }
}
