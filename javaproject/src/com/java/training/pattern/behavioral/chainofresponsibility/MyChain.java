package com.java.training.pattern.behavioral.chainofresponsibility;

import java.util.function.Predicate;

public class MyChain<T> {

    private final MyChain<T>   next;
    private final Predicate<T> predicate;
    private final String       result;

    public MyChain(final MyChain<T> nextParam,
                   final Predicate<T> predicate,
                   final String result) {
        super();
        this.next = nextParam;
        this.predicate = predicate;
        this.result = result;
    }

    public String check(final T data) {
        if (this.predicate.test(data)) {
            return this.result;
        } else {
            if (this.next != null) {
                return this.next.check(data);
            } else {
                return "Bulunamadı";
            }
        }
    }

}
