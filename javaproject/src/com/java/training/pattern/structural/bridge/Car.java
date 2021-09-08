package com.java.training.pattern.structural.bridge;


public class Car {

    protected int     speed;
    private FuelType  ft;
    private TransType tt;
    private String    model;


    public Car(final int speedParam,
               final FuelType ftParam,
               final TransType ttParam,
               final String modelParam) {
        super();
        this.speed = speedParam;
        this.ft = ftParam;
        this.tt = ttParam;
        this.model = modelParam;
    }

    public Car(final int speedParam) {
        super();
        this.speed = speedParam;
    }

    public void goForward(final int time) {
        int yol = this.speed * time;
        System.out.println("Forward : " + (yol));
    }

}
