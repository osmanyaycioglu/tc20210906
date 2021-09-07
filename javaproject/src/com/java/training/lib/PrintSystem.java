package com.java.training.lib;


public class PrintSystem {

    public void print(final Person person) {
        System.out.println("Sayın " + person.getName() + " " + person.getSurname() + " (" + person.getHeight() + ")");
    }

}
