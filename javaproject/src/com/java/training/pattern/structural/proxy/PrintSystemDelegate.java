package com.java.training.pattern.structural.proxy;

import com.java.training.lib.Person;
import com.java.training.lib.PrintSystem;

public class PrintSystemDelegate extends PrintSystem {

    private final PrintSystem ps;

    public PrintSystemDelegate(final PrintSystem psParam) {
        super();
        this.ps = psParam;
    }

    @Override
    public void print(final Person per) {
        System.out.println("Person print : " + (per == null ? "null" : per.toString()));
        this.ps.print(per);
        System.out.println("Person printed : " + per);
    }

}
