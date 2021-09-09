package com.java.training.robot;


public class FeetMotor implements IObserveRobotState {

    @Override
    public void standing() {
        System.out.println("Feet stop");

    }

    @Override
    public void walking() {
        System.out.println("Feet run");

    }

    @Override
    public void running() {
        System.out.println("Feet run");
    }

    @Override
    public void flying() {
        System.out.println("Feet closed");
    }


}
