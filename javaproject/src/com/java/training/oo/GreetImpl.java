package com.java.training.oo;


public class GreetImpl implements IGreet {


    private final int a;

    public GreetImpl(final int a) {
        this.a = a;
    }

    @Override
    public String hello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }

    public void implTalkEx(final String name) {
        System.out.println("Talking");
        System.out.println(this.hello(name));
        System.out.println(this.goodbye(name));
    }

}
