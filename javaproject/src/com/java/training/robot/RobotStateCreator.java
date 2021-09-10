package com.java.training.robot;


public class RobotStateCreator {

    public static IMoveState createRobotStates() {
        return new RobotCurrentState().register(new FeetMotor())
                                      .register(new HandMotor())
                                      .register(new BackMotor())
                                      .register(new HeadMotor())
                                      .register(new Observer1())
                                      .register(new Observer2())
                                      .register(new Observer3());
    }
}
