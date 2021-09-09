package com.java.training.pattern.behavioral.state;


public abstract class AbstractRunningState implements IRunState {

    private final String      stateStr;
    private final int         stateIndex;
    protected final IRunState cs;


    public AbstractRunningState(final String stateStrParam,
                                final int stateIndexParam,
                                final IRunState csParam) {
        super();
        this.stateStr = stateStrParam;
        this.stateIndex = stateIndexParam;
        this.cs = csParam;
    }

    @Override
    public void startCompleted() {
    }

    @Override
    public void continueRunning() {
    }

    @Override
    public void error() {
    }

    @Override
    public void suspend() {
    }

    @Override
    public void setCurrentState(final IRunState rsParam) {
    }

    @Override
    public String toString() {
        return this.stateStr + "(" + this.stateIndex + ")";
    }


}
