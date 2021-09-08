package com.java.training.pattern.behavioral.observer;


public class Sound implements IAlarm {

    @Override
    public void alarmOn() {
        System.out.println("Alarm sound on");
    }

    @Override
    public void alarmOff() {
        System.out.println("Alarm sound off");
    }

}
