package com.java.training.robot;


public class HandMotor implements IObserveRobotState {

    @Override
    public void standing() {
        System.out.println("Hand stop");

    }

    @Override
    public void walking() {
        System.out.println("Hand stop");

    }

    @Override
    public void running() {
        System.out.println("Hand run");
    }

    @Override
    public void flying() {
        System.out.println("Hand opened");
    }

}
