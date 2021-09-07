package com.java.training.pattern.creational.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        EagerSingleton.getInstance()
                      .hello();
        LazySingleton.getInstance()
                     .hello();
        EnumSingleton.X.hello();
        EnumSingleton.Y.hello();
        EnumSingleton.Z.hello();
    }
}
