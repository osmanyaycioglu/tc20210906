package com.java.training.robot;


public class HeadMotor implements IObserveRobotState {

    @Override
    public void standing() {
        System.out.println("Head moved to center");

    }

    @Override
    public void walking() {
        System.out.println("Head moved to forward");

    }

    @Override
    public void running() {
        System.out.println("Head moved to forward");
    }

    @Override
    public void flying() {
        System.out.println("Head protected");
    }

}
