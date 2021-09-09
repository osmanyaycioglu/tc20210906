package com.java.training.robot;

import java.util.ArrayList;
import java.util.List;

public class RobotCurrentState implements IMoveState {

    private IMoveState                     ms        = new StandingState(this);

    private final List<IObserveRobotState> observers = new ArrayList<>();

    public void register(final IObserveRobotState robotStateParam) {
        this.observers.add(robotStateParam);
    }

    @Override
    public void stand() {
        this.ms.stand();
    }

    @Override
    public void walk() {
        this.ms.walk();

    }

    @Override
    public void run() {
        this.ms.run();
    }

    @Override
    public void fly() {
        this.ms.fly();
    }

    @Override
    public void setCurrentState(final AbstractRobotState moveStateParam) {
        this.ms = moveStateParam;
        for (IObserveRobotState iObserveRobotStateLoc : this.observers) {
            switch (this.ms.getErs()) {
                case STANDING:
                    iObserveRobotStateLoc.standing();
                    break;
                case WALKING:
                    iObserveRobotStateLoc.walking();
                    break;
                case RUNNING:
                    iObserveRobotStateLoc.running();
                    break;
                case FLYING:
                    iObserveRobotStateLoc.flying();
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return this.ms.toString();
    }

    @Override
    public ERobotState getErs() {
        return this.ms.getErs();
    }
}
