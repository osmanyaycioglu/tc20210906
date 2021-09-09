package com.java.training.mt.job;


public class JobListener extends Thread {

    private final JobManager jm;

    public JobListener(final JobManager jmParam) {
        super();
        this.jm = jmParam;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String takeStringLoc = this.jm.takeString();
                System.out.println("Thread : " + this.getName() + " str : " + takeStringLoc);
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

}
