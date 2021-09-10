package com.training.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyInterceptor {


    @Before("execution(* com.training.spring.MyConfigBean.*(..))")
    public void abc() {
        System.out.println("before çalıştı");
    }

    @After("execution(* com.training.spring.MyConfigBean.*(..))")
    public void xyz() {
        System.out.println("after çalıştı");
    }

    @AfterReturning("execution(* com.training.spring.MyConfigBean.*(..))")
    public void cyz() {
        System.out.println("after returning çalıştı");
    }

    @Around("execution(* com.training.spring.MyConfigBean.xyz(..))")
    public Object control(final ProceedingJoinPoint jp) {
        try {
            Object[] argsLoc = jp.getArgs();
            String nameLoc = (String) argsLoc[0];
            if (nameLoc.equals("osman")) {
                Object[] newArgsLoc = new Object[1];
                newArgsLoc[0] = "ali";
                String proceedLoc = (String) jp.proceed(newArgsLoc);
                return proceedLoc + " intercepted.";
            }
            Object proceedLoc = jp.proceed();
            return proceedLoc;
        } catch (Throwable eLoc) {
            eLoc.printStackTrace();
        }
        return null;

    }


}
