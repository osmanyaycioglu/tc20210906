package com.java.training.pattern.structural.decorator;


public class PizzaExtraPeynir extends Pizza {

    private final Pizza pizza;

    public PizzaExtraPeynir(final Pizza pizzaParam) {
        super();
        this.pizza = pizzaParam;
    }

    @Override
    public int price() {
        return this.pizza.price() + 10;
    }

    @Override
    public String ingrid() {
        return this.pizza.ingrid() + " peynir";
    }

}
