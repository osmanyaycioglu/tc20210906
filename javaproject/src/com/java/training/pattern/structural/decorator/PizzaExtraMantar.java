package com.java.training.pattern.structural.decorator;


public class PizzaExtraMantar extends Pizza {

    private final Pizza pizza;


    public PizzaExtraMantar(final Pizza pizzaParam) {
        super();
        this.pizza = pizzaParam;
    }

    @Override
    public int price() {
        return this.pizza.price() + 7;
    }

    @Override
    public String ingrid() {
        return this.pizza.ingrid() + " mantar";
    }

}
