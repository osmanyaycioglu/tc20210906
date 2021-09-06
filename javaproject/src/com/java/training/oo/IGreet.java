package com.java.training.oo;

public interface IGreet {

    public static final String SERVER_IP = "10.0.0.1";

    String hello(String name);

    String goodbye(String name);

    default void talk(final String name) {
        System.out.println(this.hello(name));
        System.out.println(this.goodbye(name));
    }

    public static String concat(final String name,
                                final String surname) {
        return name + " " + surname;
    }

}
