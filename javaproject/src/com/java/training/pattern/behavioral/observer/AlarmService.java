package com.java.training.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmService implements IAlarm {

    private final List<IAlarm> alarms = new ArrayList<>();

    public void registerAlarmElement(final IAlarm alarm) {
        this.alarms.add(alarm);

    }

    @Override
    public void alarmOn() {
        for (IAlarm iAlarmLoc : this.alarms) {
            iAlarmLoc.alarmOn();
        }
    }

    @Override
    public void alarmOff() {
        for (IAlarm iAlarmLoc : this.alarms) {
            iAlarmLoc.alarmOff();
        }
    }

}
