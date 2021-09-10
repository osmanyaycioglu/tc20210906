package com.java.training.mt;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {

    public static void main(final String[] args) {
        ScheduledExecutorService nsLoc = Executors.newScheduledThreadPool(5);
        nsLoc.scheduleAtFixedRate(() -> System.out.println("Run"),
                                  3,
                                  3,
                                  TimeUnit.SECONDS);
    }
}
