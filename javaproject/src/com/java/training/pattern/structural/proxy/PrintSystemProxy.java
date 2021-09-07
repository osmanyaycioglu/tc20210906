package com.java.training.pattern.structural.proxy;

import com.java.training.lib.Person;
import com.java.training.lib.PrintSystem;

public class PrintSystemProxy extends PrintSystem {

    @Override
    public void print(final Person per) {
        System.out.println("Person print : " + (per == null ? "null" : per.toString()));
        super.print(per);
        System.out.println("Person printed : " + per);
    }

}
