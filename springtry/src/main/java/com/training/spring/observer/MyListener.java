package com.training.spring.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyCustomEvent> {

    @Override
    public void onApplicationEvent(final MyCustomEvent eventParam) {
        System.out.println("Old Event Received : " + eventParam.getMsg());
    }

}
