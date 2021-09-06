package com.java.training.oo;

import java.util.Scanner;

import com.java.training.pattern.creational.factory.GreetingFactory;

public class GreetingRun {

    private final IGreet implLoc;

    public GreetingRun(final int index) {
        this.implLoc = GreetingFactory.createGreet(index);
    }

    public void talk() {
        System.out.println("Talking");
        System.out.println(this.implLoc.hello("osman"));
        System.out.println(this.implLoc.goodbye("osman"));
    }

    public static void main(final String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Seçiminiz");
            int nextIntLoc = s.nextInt();
            GreetingRun runLoc = new GreetingRun(nextIntLoc);
            runLoc.talk();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }
}
