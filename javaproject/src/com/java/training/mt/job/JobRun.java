package com.java.training.mt.job;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JobRun {

    private final String ss;


    public JobRun(final String ssParam) {
        super();
        this.ss = ssParam;
    }

    public void callMe(final String str) {
        System.out.println("Callback : " + str);
    }

    public static void main(final String[] args) {
        JobManager jManagerLoc = new JobManager();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            JobListener jobListenerLoc = new JobListener(jManagerLoc);
            jobListenerLoc.setName("Listener-" + iLoc);
            jobListenerLoc.start();
        }
        for (int iLoc = 0; iLoc < 2_000; iLoc++) {
            jManagerLoc.add("Test-" + iLoc);
        }

        ExecutorService tpLoc = Executors.newFixedThreadPool(10);

        Future<String> strResult = tpLoc.submit(() -> {
            try {
                String takeStringLoc = jManagerLoc.takeString();
                System.out.println(Thread.currentThread()
                                         .getName()
                                   + " "
                                   + takeStringLoc);
                return takeStringLoc;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });

        //        if (strResult.isDone()) {
        //            System.out.println("biittii");
        //        } else {
        //            System.out.println("bitmedi");
        //        }
        JobRun jobRunLoc = new JobRun("osman");
        tpLoc.execute(() -> {
            try {
                String takeStringLoc = jManagerLoc.takeString();
                System.out.println(Thread.currentThread()
                                         .getName()
                                   + " "
                                   + takeStringLoc);
                jobRunLoc.callMe(takeStringLoc);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Runnables starting");
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            if (strResult.isDone()) {
                try {
                    strResult.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            tpLoc.execute(() -> {
                try {
                    String takeStringLoc = jManagerLoc.takeString();
                    System.out.println(Thread.currentThread()
                                             .getName()
                                       + " "
                                       + takeStringLoc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }


        try {
            String stringLoc = strResult.get();
            System.out.println(stringLoc);
            String ssLoc = jobRunLoc.getSs();
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }

    public String getSs() {
        return this.ss;
    }
}
