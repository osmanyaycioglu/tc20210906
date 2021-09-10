package com.java.training.robot;


public class Observer2 implements IObserver {

    @Override
    public void statusChanged(final StandingState ssParam) {
        System.out.println("Standing : 2");
    }

    @Override
    public void statusChanged(final WalkingState ssParam) {
        System.out.println("Walking : 2");

    }

    @Override
    public void statusChanged(final RunningState ssParam) {
        System.out.println("Running : 2");

    }

    @Override
    public void statusChanged(final FlyingState flyingStateParam) {
        System.out.println("Flying : 2");

    }


}
