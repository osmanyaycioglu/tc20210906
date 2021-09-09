package com.java.training.robot;


public abstract class AbstractRobotState implements IMoveState {

    protected final IMoveState robotCurrentState;
    private final ERobotState  ers;

    public AbstractRobotState(final IMoveState robotCurrentStateParam,
                              final ERobotState ersParam) {
        super();
        this.robotCurrentState = robotCurrentStateParam;
        this.ers = ersParam;
    }

    @Override
    public void stand() {
    }

    @Override
    public void walk() {
    }

    @Override
    public void run() {
    }

    @Override
    public void fly() {
    }

    @Override
    public void setCurrentState(final AbstractRobotState moveStateParam) {
        this.robotCurrentState.setCurrentState(moveStateParam);
    }

    @Override
    public String toString() {
        return this.getClass()
                   .getSimpleName();
    }

    @Override
    public ERobotState getErs() {
        return this.ers;
    }

}
