package com.java.training.mt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class MyThread extends Thread {

    public long                  counter        = 0;
    public static AtomicLong     counterLong    = new AtomicLong();
    public static CountDownLatch countDownLatch = new CountDownLatch(8);

    public List<String>          arrL           = Collections.synchronizedList(new ArrayList<>());

    public void increase() {
        this.counter++;
    }

    @Override
    public void run() {
        for (long iLoc = 0; iLoc < 100_000_000_000L; iLoc++) {
            MyThread.counterLong.incrementAndGet();
            if ((iLoc % 300_000) == 0) {
                try {
                    Thread.sleep(1);
                } catch (Exception eLoc) {
                }

            }
            this.increase();
        }
        //        while (true) {
        //            try {
        //
        //            } catch (Exception eLoc) {
        //            }
        //        }
        MyThread.countDownLatch.countDown();
    }

}
