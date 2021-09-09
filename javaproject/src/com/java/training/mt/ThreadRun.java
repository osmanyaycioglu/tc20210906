package com.java.training.mt;

import java.util.ArrayList;
import java.util.List;

public class ThreadRun {

    public static void main(final String[] args) throws Exception {
        long delta = System.currentTimeMillis();

        List<MyThread> myThreadList = new ArrayList<>();
        for (int iLoc = 0; iLoc < 16; iLoc++) {
            MyThread myThreadLoc = new MyThread();
            myThreadList.add(myThreadLoc);
            myThreadLoc.start();
        }

        MyThread.countDownLatch.await();

        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        long total = 0;
        for (MyThread myThreadLoc : myThreadList) {
            total += myThreadLoc.counter;
        }
        System.out.println(total);
    }
}
