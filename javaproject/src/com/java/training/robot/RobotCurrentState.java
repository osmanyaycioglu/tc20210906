package com.java.training.robot;

import java.util.ArrayList;
import java.util.List;

public class RobotCurrentState implements IMoveState {

    private IMoveState                     ms         = new StandingState(this);

    private final List<IObserveRobotState> observers  = new ArrayList<>();

    private final List<IObserver>          observers2 = new ArrayList<>();

    public RobotCurrentState register(final IObserveRobotState robotStateParam) {
        this.observers.add(robotStateParam);
        return this;
    }

    public RobotCurrentState register(final IObserver robotStateParam) {
        this.observers2.add(robotStateParam);
        return this;
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
        for (IObserver iObserveRobotStateLoc : this.observers2) {
            this.ms.accept(iObserveRobotStateLoc);
        }
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

    @Override
    public void accept(final IObserver observerParam) {
        // TODO Auto-generated method stub

    }
}
