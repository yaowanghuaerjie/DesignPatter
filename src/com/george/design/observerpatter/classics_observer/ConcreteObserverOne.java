package com.george.design.observerpatter.classics_observer;

public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println(getClass().getName());
    }
}
