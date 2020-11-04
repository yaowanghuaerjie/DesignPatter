package com.george.design.observerpatter.example;

import java.util.Random;

public class UserService {
    public long register(String name, String password) {
        System.out.println(name + "的用户注册成功");
        return System.currentTimeMillis();
    }
}
