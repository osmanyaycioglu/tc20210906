package com.java.training.pattern.creational.singleton;


public enum EnumSingleton {

    X("Hello"),
    Y("Merhaba") {

        @Override
        public void hello() {
            System.out.println("Merhaba");
        }
    },
    Z("Ola");

    //    X extends EnumSingleton;
    //    new X();


    private final String str;

    private EnumSingleton(final String str) {
        this.str = str;

    }

    public void hello() {
        System.out.println(this.str);
    }

}
