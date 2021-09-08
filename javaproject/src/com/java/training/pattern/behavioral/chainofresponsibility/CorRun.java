package com.java.training.pattern.behavioral.chainofresponsibility;


public class CorRun {

    public static void main(final String[] args) {
        int i = -20;
        if ((i > 0) && (i < 50)) {
            System.out.println("0 ile 50 arasında");
        } else if ((i >= 50) && (i < 150)) {
            System.out.println("50 ile 150 arasında");
        } else if (i >= 150) {
            System.out.println("150 den büyük");
        } else {
            System.out.println("0 dan küçük");
        }

        MyChain<Integer> chainLoc = ChainFactory.getChain(1);
        String checkLoc = chainLoc.check(i);
        System.out.println(checkLoc);
    }
}
