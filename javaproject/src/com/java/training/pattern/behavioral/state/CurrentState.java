package com.java.training.pattern.behavioral.state;


public class CurrentState implements IRunState {


    private IRunState currentState = new StartupState(this);

    @Override
    public void startCompleted() {
        this.currentState.startCompleted();

    }

    @Override
    public void continueRunning() {
        this.currentState.continueRunning();

    }

    @Override
    public void error() {
        this.currentState.error();

    }

    @Override
    public void suspend() {
        this.currentState.suspend();

    }

    @Override
    public void setCurrentState(final IRunState rsParam) {
        this.currentState = rsParam;
    }

    @Override
    public String toString() {
        return "Current state : " + this.currentState.toString();
    }
}
