package com.java.training.pattern.behavioral.state;


public class RunningState extends AbstractRunningState {


    public RunningState(final IRunState csParam) {
        super("Running",
              2,
              csParam);
    }

    @Override
    public void error() {
        System.out.println("Error while running");
        this.cs.setCurrentState(new ErrorState(this.cs));
    }

    @Override
    public void suspend() {
        System.out.println("Suspending system.");
        this.cs.setCurrentState(new SuspendState(this.cs));
    }


}
