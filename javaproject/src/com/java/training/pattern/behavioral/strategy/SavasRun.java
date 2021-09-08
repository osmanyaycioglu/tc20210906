package com.java.training.pattern.behavioral.strategy;


public class SavasRun {

    public static void main(final String[] args) {
        Asker askerLoc = new Asker(new Karavana());
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            askerLoc.ates();
        }

        Asker askerLoc2 = new KaravanaAsker();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            askerLoc2.ates();
        }

    }
}
