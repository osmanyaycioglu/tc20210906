package com.java.training.pattern.behavioral.observer;


public class AlarmRun {

    public static void main(final String[] args) {
        IAlarm alarmLoc = AlarmFactory.createAlarm();
        alarmLoc.alarmOn();
        System.out.println("-------------");
        alarmLoc.alarmOff();

        System.out.println("------MultiThread-------");
        IAlarm alarmLoc2 = AlarmFactory.createAlarmMultiThread();
        alarmLoc2.alarmOn();
        alarmLoc2.alarmOff();

    }
}
