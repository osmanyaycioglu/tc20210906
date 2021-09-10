package com.training.spring.oo;

import org.springframework.stereotype.Component;

@Component
public class GreetImplENG implements IGreet {

    @Override
    public String hello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }


}
