package com.java.training.pattern.behavioral.strategy;


public class KaravanaAsker extends Asker {

    int count = 0;

    public KaravanaAsker() {
        super(null);
    }

    @Override
    public void ates() {
        this.count++;
        if ((this.count % 9) == 0) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

}
