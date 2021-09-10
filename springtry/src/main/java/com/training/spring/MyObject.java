package com.training.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy
public class MyObject {

    long counter = 0;


    public void showCounter() {
        this.counter++;
        System.out.println("Counter : " + this.counter);
    }

    @Scheduled(fixedDelay = 3000)
    public void test() {
        System.out.println("Test");
    }
}
