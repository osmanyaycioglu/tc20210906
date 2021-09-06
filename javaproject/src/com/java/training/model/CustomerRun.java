package com.java.training.model;


public class CustomerRun {

    public static void main(final String[] args) {
        //        Customer customerLoc = new Customer("osman",
        //                                            "yaycioglu",
        //                                            52);
        //
        //        Customer customerLoc2 = new Customer("ali",
        //                                             "yaycioglu",
        //                                             35,
        //                                             200);
        Customer customerLoc = new Customer().setName("osman")
                                             .setSurname("yaycıoğlu")
                                             .setAge(51)
                                             .setHeight(200);
    }
}
