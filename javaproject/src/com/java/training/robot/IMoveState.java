package com.java.training.robot;


public interface IMoveState {

    void stand();

    void walk();

    void run();

    void fly();

    void setCurrentState(AbstractRobotState moveStateParam);

    ERobotState getErs();

    public void accept(final IObserver observerParam);
}
