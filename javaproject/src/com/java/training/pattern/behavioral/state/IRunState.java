package com.java.training.pattern.behavioral.state;


public interface IRunState {

    void startCompleted();

    void continueRunning();

    void error();

    void suspend();

    void setCurrentState(IRunState rs);
}
