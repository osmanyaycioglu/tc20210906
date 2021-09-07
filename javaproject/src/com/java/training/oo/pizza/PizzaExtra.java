package com.java.training.oo.pizza;

import java.util.function.Function;

public class PizzaExtra extends Pizza {

    private final Pizza                      pizza;
    private final String                     name;
    private final Function<Integer, Integer> priceFun;

    public PizzaExtra(final Pizza pizzaParam,
                      final String name,
                      final Function<Integer, Integer> priceFun) {
        super();
        this.pizza = pizzaParam;
        this.name = name;
        this.priceFun = priceFun;
    }

    @Override
    public int price() {
        return this.priceFun.apply(this.pizza.price());
    }

    @Override
    public String ingrid() {
        return this.pizza.ingrid() + " " + this.name;
    }

}
