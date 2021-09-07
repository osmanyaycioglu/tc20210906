package com.java.training.pattern.creational.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    static {
        System.out.println("First static");
    }

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }

    public void hello() {
        System.out.println("Hello");
    }

}
