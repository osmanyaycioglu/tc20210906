package com.java.training.oo.ext;


public class DogBehavior extends AnimalBehavior {

    @Override
    public String walking() {
        return "dog walking";
    }

    @Override
    public String talking() {
        return "dog talking";
    }

}
