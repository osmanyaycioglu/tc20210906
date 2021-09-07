package com.java.training.pattern.structural.adapter;

import com.java.training.lib.Employee;
import com.java.training.lib.Person;
import com.java.training.lib.PrintSystem;
import com.java.training.pattern.structural.proxy.PrintSystemDelegate;
import com.java.training.pattern.structural.proxy.PrintSystemProxy;

public class PrintRun {

    public static void main(final String[] args) {
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);

        Employee employeeLoc = new Employee();
        employeeLoc.setName("osman yaycıoğlu");
        employeeLoc.setHeight(6.6D);

        Person per = new EmployeePersonAdapter(employeeLoc);


        PrintSystem printSystemLoc = new PrintSystemProxy();
        // System.out.println("Person print : " + (per == null ? "null" : per.toString()));
        printSystemLoc.print(per);
        // System.out.println("Person printed : " + per);

        PrintSystem printSystemLoc2 = new PrintSystem();
        PrintSystem psDelegate = new PrintSystemDelegate(printSystemLoc2);
        psDelegate.print(personLoc);
    }
}
