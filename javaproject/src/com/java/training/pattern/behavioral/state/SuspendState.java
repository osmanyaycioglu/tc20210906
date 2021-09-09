package com.java.training.pattern.behavioral.state;


public class SuspendState extends AbstractRunningState {


    public SuspendState(final IRunState csParam) {
        super("Suspend",
              4,
              csParam);
    }

    @Override
    public void continueRunning() {
        System.out.println("Suspend finished");
        this.cs.setCurrentState(new RunningState(this.cs));
    }


}
