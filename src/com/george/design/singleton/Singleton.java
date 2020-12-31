package com.george.design.singleton;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance(){
        return Singleton.getInstance();
    }

    public static class SingletonHolder {
        public Singleton getSingleton() {
            return new Singleton();
        }
    }
}
