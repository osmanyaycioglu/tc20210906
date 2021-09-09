package com.java.training.robot;


public class BackMotor implements IObserveRobotState {

    @Override
    public void standing() {
        System.out.println("Back stop");

    }

    @Override
    public void walking() {
        System.out.println("Back run");

    }

    @Override
    public void running() {
        System.out.println("Back run");
    }

    @Override
    public void flying() {
        System.out.println("Back closed");
    }


}
