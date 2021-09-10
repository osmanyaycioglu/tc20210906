package com.java.training.robot;

public class WalkingState extends AbstractRobotState {


    public WalkingState(final IMoveState robotCurrentStateParam) {
        super(robotCurrentStateParam,
              ERobotState.WALKING);
    }

    @Override
    public void stand() {
        System.out.println("[Walking] state to [Standing] State");
        this.robotCurrentState.setCurrentState(new StandingState(this.robotCurrentState));

    }

    @Override
    public void run() {
        System.out.println("[Walking] state to [Running] State");
        this.robotCurrentState.setCurrentState(new RunningState(this.robotCurrentState));
    }

    @Override
    public void accept(final IObserver observerParam) {
        observerParam.statusChanged(this);
    }

}
