package com.java.training.pattern.creational.prototype;


public class Car {

    private String model;
    private String number;
    private int    horsePower;
    private int    speed;
    private int    doorCount;
    private String runTimeData;

    protected Car cloneMe() {
        Car c = new Car();
        c.model = this.model;
        c.number = this.number;
        c.horsePower = this.horsePower;
        c.speed = this.speed;
        c.doorCount = this.doorCount;
        return c;
    }

    public Car() {

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String modelParam) {
        this.model = modelParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(final int horsePowerParam) {
        this.horsePower = horsePowerParam;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(final int speedParam) {
        this.speed = speedParam;
    }


    public int getDoorCount() {
        return this.doorCount;
    }


    public void setDoorCount(final int doorCountParam) {
        this.doorCount = doorCountParam;
    }

    public String getRunTimeData() {
        return this.runTimeData;
    }

    public void setRunTimeData(final String runTimeDataParam) {
        this.runTimeData = runTimeDataParam;
    }


}
