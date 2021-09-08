package com.java.training.oo.ext;


public class Cat extends AnimalOld {

    @Override
    public void talk() {
        System.out.println("Cat Talking");
    }

    @Override
    public void walk() {
        System.out.println("Cat Walking");
    }

}
