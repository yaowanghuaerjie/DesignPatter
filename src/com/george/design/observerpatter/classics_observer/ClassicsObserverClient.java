package com.george.design.observerpatter.classics_observer;

public class ClassicsObserverClient {
    public static void main(String[] args) {
        EmailSubject emailSubject = new EmailSubject();
        ConcreteObserverOne one = new ConcreteObserverOne();
        ConcreteObserverTwo two = new ConcreteObserverTwo();
        emailSubject.registerObserver(one);
        emailSubject.registerObserver(two);
        emailSubject.notifyObserver(new Message());
    }
}
