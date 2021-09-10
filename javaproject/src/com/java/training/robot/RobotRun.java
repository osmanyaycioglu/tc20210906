package com.java.training.robot;


public class RobotRun {

    public static void main(final String[] args) {

        IMoveState currentStateLoc = RobotStateCreator.createRobotStates();
        currentStateLoc.walk();
        System.out.println(currentStateLoc.toString());
        currentStateLoc.run();
        System.out.println(currentStateLoc.toString());
        currentStateLoc.fly();
        System.out.println(currentStateLoc.toString());
        currentStateLoc.run();
        System.out.println(currentStateLoc.toString());
        currentStateLoc.stand();
        System.out.println(currentStateLoc.toString());
    }
}
