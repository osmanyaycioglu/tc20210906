package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.oo.IGreet;

@RestController
@RequestMapping("/first")
public class MyFirstRest {

    @Autowired
    @Qualifier("myObject")
    private MyObject mo;

    @Autowired
    @Qualifier("createMyObject")
    private MyObject mo2;

    @Autowired
    @Qualifier("createMyObject2")
    private MyObject mo3;

    @Autowired
    @Qualifier("createGreet")
    private IGreet   greet;

    @GetMapping("/hello")
    public String hello() {
        this.mo.showCounter();
        this.mo2.showCounter();
        this.mo3.showCounter();
        return "Hello world";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return this.greet.hello("osman");
    }

}
