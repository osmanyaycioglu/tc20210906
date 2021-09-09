package com.java.training.mt.job;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JobRun {

    public static void main(final String[] args) {
        JobManager jManagerLoc = new JobManager();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            JobListener jobListenerLoc = new JobListener(jManagerLoc);
            jobListenerLoc.setName("Listener-" + iLoc);
            jobListenerLoc.start();
        }
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            jManagerLoc.add("Test-" + iLoc);
        }

        ExecutorService tpLoc = Executors.newFixedThreadPool(10);
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            tpLoc.execute(() -> {
                try {
                    String takeStringLoc = jManagerLoc.takeString();
                    System.out.println(Thread.currentThread()
                                             .getName()
                                       + " "
                                       + takeStringLoc);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        }
    }
}
