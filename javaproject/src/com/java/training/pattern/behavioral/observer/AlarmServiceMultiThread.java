package com.java.training.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AlarmServiceMultiThread implements IAlarm {

    private final List<IAlarm> alarms = new ArrayList<>();
    private Executor           executor;

    public void registerAlarmElement(final IAlarm alarm) {
        this.alarms.add(alarm);
        this.executor = Executors.newFixedThreadPool(5);

    }

    @Override
    public void alarmOn() {
        for (IAlarm iAlarmLoc : this.alarms) {
            this.executor.execute(() -> iAlarmLoc.alarmOn());
        }
    }

    @Override
    public void alarmOff() {
        for (IAlarm iAlarmLoc : this.alarms) {
            this.executor.execute(() -> iAlarmLoc.alarmOff());
        }
    }

}
