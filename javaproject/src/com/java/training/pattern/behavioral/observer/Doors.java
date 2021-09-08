package com.java.training.pattern.behavioral.observer;


public class Doors implements IAlarm {

    @Override
    public void alarmOn() {
        System.out.println("doors opened.");
    }

    @Override
    public void alarmOff() {
        System.out.println("doors status not changed.");
    }

}
