package com.george.design.observerpatter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用来表示@Subscribe注解的方法，其中target表示观察者类，method表示方法，主要用在ObserverRegister观察者注册表中
 */
public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
