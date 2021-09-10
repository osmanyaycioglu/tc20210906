package com.training.spring;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.observer.MyCustomEvent;
import com.training.spring.oo.IGreet;

@RestController
@RequestMapping("/first")
public class MyFirstRest {

    @Autowired
    @Qualifier("myObject")
    private MyObject                  mo;

    @Autowired
    @Qualifier("createMyObject")
    private MyObject                  mo2;

    @Autowired
    @Qualifier("createMyObject2")
    private MyObject                  mo3;

    @Autowired
    @Qualifier("createGreet")
    private IGreet                    greet;

    @Autowired
    private MyConfigBean              mcb;

    @Autowired
    private ApplicationEventPublisher aep;

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

    @GetMapping("/hello3")
    public String hello3() {
        return this.mcb.xyz("osman");
    }

    @GetMapping("/hello5")
    public String hello5() throws InterruptedException, ExecutionException {
        Future<String> xyzStrLoc = this.mcb.xyzStr("osman");
        System.out.println("Async started");
        return xyzStrLoc.get();
    }

    @GetMapping("/hello4")
    public String hello4() {
        this.aep.publishEvent(new MyCustomEvent(this,
                                                "My event from rest"));
        return "SUCCESS";
    }

}
