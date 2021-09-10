package com.training.spring;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;

@Configuration(proxyBeanMethods = true)
public class MyConfigBean {

    public String xyz(final String name) {
        System.out.println("XYZ");
        return "Config method return " + name;
    }

    @Async("executor")
    public Future<String> xyzStr(final String name) {
        return CompletableFuture.completedFuture("osman");
    }

}
