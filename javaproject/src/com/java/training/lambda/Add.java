package com.java.training.lambda;


public class Add implements ICalculator {

    @Override
    public int calculate(final int aParam,
                         final int bParam) {
        return aParam + bParam;
    }

}
