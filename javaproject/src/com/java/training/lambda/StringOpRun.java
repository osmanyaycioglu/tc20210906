package com.java.training.lambda;


public class StringOpRun {

    public static void main(final String[] args) {
        MyStringOp myStringOpLoc = new MyStringOp();
        myStringOpLoc.setName("osman");
        myStringOpLoc.setSurname("yaycıoğlu");
        System.out.println(myStringOpLoc.mr());
        System.out.println(myStringOpLoc.dear());
        System.out.println(myStringOpLoc.ff());

        MyStringOpNew newLoc = new MyStringOpNew("osman",
                                                 "yaycıoğlu");
        System.out.println(newLoc.process(s -> "Mr " + s));
        System.out.println(newLoc.process(s -> "Dear " + s));
        System.out.println(newLoc.process(s -> "Mear " + s));
        System.out.println(newLoc.process(s -> s + " ff"));

        System.out.println(new MyStringOpNew("osman",
                                             "yaycıoğlu").cat(s -> "Mr " + s)
                                                         .cat(s -> "Dear " + s)
                                                         .cat(s -> s + " FF")
                                                         .cat(d -> d + " Sonsuz")
                                                         .getResult());

    }
}
