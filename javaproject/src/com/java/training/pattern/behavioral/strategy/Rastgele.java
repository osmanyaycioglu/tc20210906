package com.java.training.pattern.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class Rastgele implements IHedefleme {

    Random r = new SecureRandom();

    @Override
    public void atesEt() {
        int count = this.r.nextInt(100);
        if (count > 50) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

}
