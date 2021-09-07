package com.java.training.oo.pizza;


public class PizzaExtraPeperoni extends Pizza {

    private final Pizza pizza;

    public PizzaExtraPeperoni(final Pizza pizzaParam) {
        super();
        this.pizza = pizzaParam;
    }

    @Override
    public int price() {
        return this.pizza.price() + 20;
    }

    @Override
    public String ingrid() {
        return this.pizza.ingrid() + " peperoni";
    }

}
