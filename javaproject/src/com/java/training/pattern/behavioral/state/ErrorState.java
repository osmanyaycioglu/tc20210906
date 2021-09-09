package com.java.training.pattern.behavioral.state;


public class ErrorState extends AbstractRunningState {


    public ErrorState(final IRunState csParam) {
        super("Error",
              3,
              csParam);
    }

    @Override
    public void continueRunning() {
        System.out.println("Error fixed. Running");
        this.cs.setCurrentState(new RunningState(this.cs));
    }


}
