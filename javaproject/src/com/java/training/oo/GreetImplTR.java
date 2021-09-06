package com.java.training.oo;


public class GreetImplTR implements IGreet {


    private final int a;

    public GreetImplTR(final int a) {
        this.a = a;
    }

    @Override
    public String hello(final String nameParam) {
        return "Merhaba " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Güle güle " + nameParam;
    }

    public void implTalkEx(final String name) {
        System.out.println("Konuşuyorum");
        System.out.println(this.hello(name));
        System.out.println(this.goodbye(name));
    }

}
