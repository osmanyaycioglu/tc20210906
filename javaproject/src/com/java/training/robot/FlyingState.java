package com.java.training.robot;

public class FlyingState extends AbstractRobotState {


    public FlyingState(final IMoveState robotCurrentStateParam) {
        super(robotCurrentStateParam,
              ERobotState.FLYING);
    }

    @Override
    public void run() {
        System.out.println("[Flying] state to [Running] State");
        this.robotCurrentState.setCurrentState(new RunningState(this.robotCurrentState));
    }

    @Override
    public void accept(final IObserver observerParam) {
        observerParam.statusChanged(this);
    }


}
