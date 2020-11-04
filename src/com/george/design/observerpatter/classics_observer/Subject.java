package com.george.design.observerpatter.classics_observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Message message);
}
