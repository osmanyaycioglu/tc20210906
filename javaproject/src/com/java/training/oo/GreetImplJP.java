package com.java.training.oo;


public class GreetImplJP implements IGreet {


    private final int a;

    public GreetImplJP(final int a) {
        this.a = a;
    }

    @Override
    public String hello(final String nameParam) {
        return "Ha " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Hola " + nameParam;
    }

    public void implTalkEx(final String name) {
        System.out.println("jkasdhd");
        System.out.println(this.hello(name));
        System.out.println(this.goodbye(name));
    }

}
