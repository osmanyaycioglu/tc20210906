package com.java.training.pattern.behavioral.strategy;


public class Normal implements IHedefleme {

    int count = 0;

    @Override
    public void atesEt() {
        this.count++;
        if ((this.count % 2) == 0) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

}
