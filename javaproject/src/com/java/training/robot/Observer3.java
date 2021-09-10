package com.java.training.robot;


public class Observer3 implements IObserver {

    @Override
    public void statusChanged(final StandingState ssParam) {
        System.out.println("Standing : 3");
    }

    @Override
    public void statusChanged(final WalkingState ssParam) {
        System.out.println("Walking : 3");

    }

    @Override
    public void statusChanged(final RunningState ssParam) {
        System.out.println("Running : 3");

    }

    @Override
    public void statusChanged(final FlyingState flyingStateParam) {
        System.out.println("Flying : 3");
    }


}
