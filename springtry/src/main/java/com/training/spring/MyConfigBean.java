package com.training.spring;

import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class MyConfigBean {

    public String xyz(final String name) {
        System.out.println("XYZ");
        return "Config method return " + name;
    }

}
