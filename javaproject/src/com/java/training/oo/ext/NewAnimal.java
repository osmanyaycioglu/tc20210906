package com.java.training.oo.ext;


public class NewAnimal extends Animal {

    public NewAnimal(final AnimalBehavior abParam) {
        super(abParam);
    }

    public void test() {
        System.out.println("Animal testing");
    }

}
