package com.java.training.robot;


public class StandingState extends AbstractRobotState {


    public StandingState(final IMoveState robotCurrentStateParam) {
        super(robotCurrentStateParam,
              ERobotState.STANDING);
    }

    @Override
    public void walk() {
        System.out.println("[Standing] state to [Walking] State");
        this.robotCurrentState.setCurrentState(new WalkingState(this.robotCurrentState));
    }

    @Override
    public void run() {
        System.out.println("[Standing] state to [Running] State");
        this.robotCurrentState.setCurrentState(new RunningState(this.robotCurrentState));
    }

    @Override
    public void accept(final IObserver observerParam) {
        observerParam.statusChanged(this);
    }

}
