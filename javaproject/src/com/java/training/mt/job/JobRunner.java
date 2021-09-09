package com.java.training.mt.job;


public class JobRunner extends Thread {

    private final JobManager jm;

    public JobRunner(final JobManager jmParam) {
        super();
        this.jm = jmParam;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Runnable takeRunLoc = this.jm.takeRun();
                takeRunLoc.run();
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

}
