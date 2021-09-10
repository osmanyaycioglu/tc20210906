package com.java.training.robot;


public class Observer1 implements IObserver {

    @Override
    public void statusChanged(final StandingState ssParam) {
        System.out.println("Standing : 1");
    }

    @Override
    public void statusChanged(final WalkingState ssParam) {
        System.out.println("Walking : 1");

    }

    @Override
    public void statusChanged(final RunningState ssParam) {
        System.out.println("Running : 1");

    }

    @Override
    public void statusChanged(final FlyingState flyingStateParam) {
        System.out.println("Flying : 1");

    }


}
