package com.java.training.oo.ext;


public class Animal {

    private final AnimalBehavior ab;

    public Animal(final AnimalBehavior abParam) {
        super();
        this.ab = abParam;
    }

    public void talk() {
        System.out.println(this.ab.talking());
    }

    public void walk() {
        System.out.println(this.ab.walking());
    }

}
