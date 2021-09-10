package com.java.training.robot;


public interface IObserver {

    void statusChanged(StandingState ss);

    void statusChanged(WalkingState ss);

    void statusChanged(RunningState ss);

    void statusChanged(FlyingState ss);

}
