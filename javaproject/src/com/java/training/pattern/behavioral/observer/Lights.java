package com.java.training.pattern.behavioral.observer;


public class Lights implements IAlarm {

    @Override
    public void alarmOn() {
        System.out.println("Lights turn on");
    }

    @Override
    public void alarmOff() {
        System.out.println("Lights still turn on");
    }

}
