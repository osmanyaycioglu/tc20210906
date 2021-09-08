package com.java.training.pattern.behavioral.chainofresponsibility;


public class ChainFactory {

    public static MyChain<Integer> getChain(final int chainType) {

        MyChain<Integer> chainLoc = new MyChain<>(null,
                                                  i -> true,
                                                  "0 dan küçük");

        MyChain<Integer> chainLoc2 = new MyChain<>(chainLoc,
                                                   i -> (i >= 50) && (i < 150),
                                                   "50 ile 150 arasında");

        MyChain<Integer> chainLoc3 = new MyChain<>(chainLoc2,
                                                   i -> i >= 150,
                                                   "150 den büyük");
        MyChain<Integer> chainLoc4 = new MyChain<>(chainLoc3,
                                                   i -> (i > 0) && (i < 50),
                                                   "0 ile 50 arasında");

        return chainLoc4;
    }

}
