package com.training.spring.observer;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {

    private static final long serialVersionUID = -7771409273778834489L;
    private final String      msg;

    public MyCustomEvent(final Object sourceParam,
                         final String msg) {
        super(sourceParam);

        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

}
