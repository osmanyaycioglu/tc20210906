package com.java.training.oo.ext;


public class BirdBehavior extends AnimalBehavior {

    @Override
    public String walking() {
        return "bird flying";
    }

    @Override
    public String talking() {
        return "bird sound";
    }

}
