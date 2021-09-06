package com.java.training.pattern.creational.builder;


public class BuilderRun {

    public static void main(final String[] args) {
        CustomerEx customerExLoc = CustomerEx.builder()
                                             .name("osman")
                                             .surname("yaycıoğlu")
                                             .age(51)
                                             .height(200)
                                             .build();

    }
}
