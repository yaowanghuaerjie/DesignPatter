package com.george.design.observerpatter.eventbus;

public class UserService {

    public long register(String telePhone, String password) {
        System.out.println("telephone:" + telePhone + " 注册成功");
        return System.currentTimeMillis();
    }
}
