package com.java.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaRun {

    public static void main(final String[] args) {
        IExecute execute1 = o -> "Hello " + o;
        System.out.println(execute1.exec("osman"));

        Function<String, String> f = u -> "Merhaba " + u;
        System.out.println(f.apply("osman"));

        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ayşe");
        for (String stringLoc : listLoc) {
            System.out.println(stringLoc);
        }

        listLoc.forEach(z -> System.out.println(z));

        listLoc.forEach(System.out::println);
    }
}
