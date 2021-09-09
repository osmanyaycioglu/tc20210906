package com.java.training.pattern.behavioral.state;


public class StateRun {

    public static void main(final String[] args) {
        CurrentState currentStateLoc = new CurrentState();
        System.out.println(currentStateLoc);
        currentStateLoc.startCompleted();
        System.out.println(currentStateLoc);
        currentStateLoc.error();
        currentStateLoc.error();
        currentStateLoc.error();
        currentStateLoc.error();
        currentStateLoc.error();
        currentStateLoc.error();
        System.out.println(currentStateLoc);
        currentStateLoc.continueRunning();
        System.out.println(currentStateLoc);
        currentStateLoc.suspend();
        System.out.println(currentStateLoc);
        currentStateLoc.continueRunning();
        System.out.println(currentStateLoc);


    }
}
