package com.java.training.pattern.behavioral.strategy;


public class Asker {

    private final IHedefleme h;

    public Asker(final IHedefleme hParam) {
        super();
        this.h = hParam;
    }

    public void ates() {
        this.h.atesEt();
    }


}
