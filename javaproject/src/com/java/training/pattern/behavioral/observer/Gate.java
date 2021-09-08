package com.java.training.pattern.behavioral.observer;


public class Gate implements IAlarm {

    @Override
    public void alarmOn() {
        System.out.println("gate opened.");
    }

    @Override
    public void alarmOff() {
        System.out.println("gate closed");
    }

}
