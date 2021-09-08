package com.java.training.oo.ext;


public class AnimalRun {

    public static void main(final String[] args) {
        AnimalOld an = new Dog();
        an.walk();
        an.talk();

        NewAnimal animalLoc = new NewAnimal(new DogBehavior());
        animalLoc.walk();
        animalLoc.talk();
        animalLoc.test();
        System.out.println("---------------------");
        Animal animal2Loc = new Mamal(new CatBehavior());
        animal2Loc.walk();
        animal2Loc.talk();

    }
}
