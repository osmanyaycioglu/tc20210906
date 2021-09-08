package com.java.training.pattern.behavioral.observer;


public class AlarmFactory {

    public static IAlarm createAlarm() {
        AlarmService alarmServiceLoc = new AlarmService();
        alarmServiceLoc.registerAlarmElement(new Lights());
        alarmServiceLoc.registerAlarmElement(new Sound());
        alarmServiceLoc.registerAlarmElement(new Doors());
        alarmServiceLoc.registerAlarmElement(new Gate());
        return alarmServiceLoc;
    }

    public static IAlarm createAlarmMultiThread() {
        AlarmServiceMultiThread alarmServiceLoc = new AlarmServiceMultiThread();
        alarmServiceLoc.registerAlarmElement(new Lights());
        alarmServiceLoc.registerAlarmElement(new Sound());
        alarmServiceLoc.registerAlarmElement(new Doors());
        alarmServiceLoc.registerAlarmElement(new Gate());
        return alarmServiceLoc;
    }

}
