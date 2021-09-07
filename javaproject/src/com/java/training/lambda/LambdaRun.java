package com.java.training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaRun {

    public static void main(final String[] args) {
        IExecute execute1 = o -> "Hello " + o;
        System.out.println(execute1.exec("osman"));

        Function<String, String> f = u -> "Merhaba " + u;
        System.out.println(f.apply("osman"));

        List<String> listLoc = Arrays.asList("osman",
                                             "osman",
                                             "ahmet",
                                             "osman",
                                             "mehmet",
                                             "ali",
                                             "mehmet",
                                             "veli",
                                             "mehmet",
                                             "ayşe");
        for (String stringLoc : listLoc) {
            System.out.println(stringLoc);
        }

        listLoc.forEach(z -> System.out.println(z));

        listLoc.forEach(System.out::println);

        System.out.println("-------------1-------------");
        listLoc.stream()
               .filter(d -> d.length() > 3)
               .distinct()
               .sorted()
               .forEach(System.out::println);
        System.out.println("-------------2-------------");
        listLoc.stream()
               .distinct()
               .sorted()
               .parallel()
               .filter(d -> d.length() > 3)
               .peek(o -> System.out.println("Thread : "
                                             + Thread.currentThread()
                                                     .getName()
                                             + " "
                                             + o))
               .map(r -> r.length())
               .forEach(System.out::println);
        System.out.println("-------------3-------------");
        listLoc.stream()
               .distinct()
               .sorted()
               .filter(d -> d.length() > 3)
               .map(r -> r.length())
               .forEach(System.out::println);

        System.out.println("-------------3-------------");
        List<String> collectLoc = listLoc.stream()
                                         .distinct()
                                         .sorted()
                                         .filter(d -> d.length() > 3)
                                         .collect(Collectors.toList());
        collectLoc.forEach(System.out::println);


    }
}
