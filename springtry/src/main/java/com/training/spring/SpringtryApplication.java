package com.training.spring;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import com.training.spring.oo.GreetImplENG;
import com.training.spring.oo.GreetImplESP;
import com.training.spring.oo.GreetImplTR;
import com.training.spring.oo.IGreet;

@SpringBootApplication
@EnableScheduling
@ServletComponentScan
@EnableAspectJAutoProxy
@EnableAsync
//@Controller
//@Service
//@Configuration
//@Repository
public class SpringtryApplication {

    @Autowired
    private MyObject mo;

    @Autowired
    private MyObject mo2;

    @Autowired
    private MyObject mo3;


    @Bean
    public MyObject createMyObject() {
        return new MyObject();
    }

    @Bean
    public Executor executor() {
        return Executors.newFixedThreadPool(10);
    }

    @Bean
    public MyObject createMyObject2() {
        return new MyObject();
    }

    @Autowired
    private Environment env;

    @Bean
    public IGreet createGreet() {
        switch (this.env.getProperty("app.rest.lang")) {
            case "eng":
                return new GreetImplENG();
            case "tr":
                return new GreetImplTR();
            case "esp":
                return new GreetImplESP();
            default:
                return new GreetImplENG();
        }
    }

    @Scheduled(fixedDelay = 3000, initialDelay = 3000)
    private void name() {
        RestTemplate restTemplateLoc = new RestTemplate();
        String forObjectLoc = restTemplateLoc.getForObject("http://127.0.0.1:7070/first/hello",
                                                           String.class);
        System.out.println("Result from rest : " + forObjectLoc);
        System.out.println("Schedule");
        this.mo.showCounter();
        this.mo2.showCounter();
        this.mo3.showCounter();
    }

    public static void main(final String[] args) {
        SpringApplication.run(SpringtryApplication.class,
                              args);
    }

}
