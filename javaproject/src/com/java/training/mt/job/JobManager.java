package com.java.training.mt.job;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JobManager {

    private final BlockingQueue<String>   strQueue = new ArrayBlockingQueue<>(1_000_000);
    private final BlockingQueue<Runnable> runQueue = new ArrayBlockingQueue<>(1_000_000);

    public String takeString() throws InterruptedException {
        //        String pollLoc = null;
        //        while ((pollLoc = this.strQueue.poll()) == null) {
        //            try {
        //                Thread.sleep(10);
        //            } catch (Exception eLoc) {
        //                // TODO: handle exception
        //            }
        //        }

        return this.strQueue.take();
    }

    public void add(final String str) {
        this.strQueue.add(str);
    }

    public Runnable takeRun() throws InterruptedException {
        return this.runQueue.take();
    }

}
