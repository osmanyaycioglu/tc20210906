package com.java.training.pattern.behavioral.state;


public class StartupState extends AbstractRunningState {

    public StartupState(final IRunState csParam) {
        super("Startup",
              1,
              csParam);
    }

    @Override
    public void startCompleted() {
        System.out.println("Start completed closing resources and start running");
        this.cs.setCurrentState(new RunningState(this.cs));
    }


    @Override
    public void error() {
        System.out.println("Error occurred.");
        this.cs.setCurrentState(new ErrorState(this.cs));
    }


}
