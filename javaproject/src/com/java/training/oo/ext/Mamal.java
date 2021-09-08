package com.java.training.oo.ext;


public class Mamal extends Animal {

    private final AnimalBehavior ab;

    public Mamal(final AnimalBehavior abParam) {
        super(abParam);
        this.ab = abParam;
    }

    @Override
    public void talk() {
        System.out.println("Talking start");
        System.out.println(this.ab.talking());
    }

    @Override
    public void walk() {
        System.out.println("Walking start");
        System.out.println(this.ab.walking());
    }

}
