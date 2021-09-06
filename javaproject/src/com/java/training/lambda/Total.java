package com.java.training.lambda;


public class Total {

    private int total;

    public int getTotal() {
        return this.total;
    }

    public void setTotal(final int totalParam) {
        this.total = totalParam;
    }

    public void add(final int delta) {
        this.total = this.total + delta;
    }
}
