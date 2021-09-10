package com.training.spring.oo;

import org.springframework.stereotype.Component;

@Component
public class GreetImplESP implements IGreet {

    @Override
    public String hello(final String nameParam) {
        return "Ola " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Adios " + nameParam;
    }


}
