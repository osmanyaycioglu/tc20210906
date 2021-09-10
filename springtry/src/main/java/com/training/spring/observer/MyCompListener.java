package com.training.spring.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyCompListener {


    @EventListener
    public void xyz(final MyCustomEvent mce) {
        System.out.println("New Event received : " + mce.getMsg());
    }

}
