package com.java.training.robot;


public class RobotRun {

    public static void main(final String[] args) {

        FeetMotor fMotorLoc = new FeetMotor();
        HandMotor handMotorLoc = new HandMotor();
        BackMotor backMotorLoc = new BackMotor();
        HeadMotor headMotorLoc = new HeadMotor();

        RobotCurrentState currentStateLoc = new RobotCurrentState();
        currentStateLoc.register(fMotorLoc);
        currentStateLoc.register(handMotorLoc);
        currentStateLoc.register(backMotorLoc);
        currentStateLoc.register(headMotorLoc);
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
