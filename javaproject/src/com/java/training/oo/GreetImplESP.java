package com.java.training.oo;


public class GreetImplESP implements IGreet {


    private final int a;

    public GreetImplESP(final int a) {
        this.a = a;
    }

    @Override
    public String hello(final String nameParam) {
        return "Ola " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Adios " + nameParam;
    }

    public void implTalkEx(final String name) {
        System.out.println("XYZ");
        System.out.println(this.hello(name));
        System.out.println(this.goodbye(name));
    }

}
