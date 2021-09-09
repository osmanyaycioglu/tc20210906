package com.java.training.robot;


public class RunningState extends AbstractRobotState {


    public RunningState(final IMoveState robotCurrentStateParam) {
        super(robotCurrentStateParam,
              ERobotState.RUNNING);
    }

    @Override
    public void stand() {
        System.out.println("[Running] state to [Standing] State");
        this.robotCurrentState.setCurrentState(new StandingState(this.robotCurrentState));
    }

    @Override
    public void walk() {
        System.out.println("[Running] state to [Walking] State");
        this.robotCurrentState.setCurrentState(new WalkingState(this.robotCurrentState));
    }

    @Override
    public void fly() {
        System.out.println("[Running] state to [Flying] State");
        this.robotCurrentState.setCurrentState(new FlyingState(this.robotCurrentState));
    }
}
