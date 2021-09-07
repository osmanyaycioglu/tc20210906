package com.java.training.lib;


public class PrintRun {

    public static void main(final String[] args) {
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);

        Employee employeeLoc = new Employee();
        employeeLoc.setName("osman yaycıoğlu");
        employeeLoc.setHeight(6.6D);


        PrintSystem printSystemLoc = new PrintSystem();
        printSystemLoc.print(personLoc);
    }
}
