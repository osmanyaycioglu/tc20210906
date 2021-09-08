package com.java.training.oo.ext;


public class Dog extends AnimalOld {

    @Override
    public void talk() {
        System.out.println("Dog Talking");
    }

    @Override
    public void walk() {
        System.out.println("Dog Walking");
    }

}
