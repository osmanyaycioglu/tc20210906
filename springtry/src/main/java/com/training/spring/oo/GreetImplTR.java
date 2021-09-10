package com.training.spring.oo;

import org.springframework.stereotype.Component;

@Component
public class GreetImplTR implements IGreet {

    @Override
    public String hello(final String nameParam) {
        return "Merhaba " + nameParam;
    }

    @Override
    public String goodbye(final String nameParam) {
        return "Güle güle " + nameParam;
    }


}
