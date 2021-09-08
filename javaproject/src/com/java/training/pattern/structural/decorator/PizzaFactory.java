package com.java.training.pattern.structural.decorator;


public class PizzaFactory {


    public static Pizza addToPizza(final Pizza pizzaParam,
                                   final String extra) {
        switch (extra) {
            case "peynir":
                return new PizzaExtra(pizzaParam,
                                      "peynir",
                                      i -> i + 10);
            case "mantar":
                return new PizzaExtra(pizzaParam,
                                      "mantar",
                                      i -> i + 7);
            case "peperoni":
                return new PizzaExtra(pizzaParam,
                                      "peperoni",
                                      i -> i + 20);
            case "misir":
                return new PizzaExtra(pizzaParam,
                                      "misir",
                                      i -> i + 5);
            case "zeytin":
                return new PizzaExtra(pizzaParam,
                                      "zeytin",
                                      i -> i + 6);

            default:
                return pizzaParam;
        }
    }

    public static Pizza addToPizza2(final Pizza pizzaParam,
                                    final String extra) {
        switch (extra) {
            case "peynir":
                return new PizzaExtraPeynir(pizzaParam);
            case "mantar":
                return new PizzaExtraMantar(pizzaParam);
            case "peperoni":
                return new PizzaExtraPeperoni(pizzaParam);
            default:
                return pizzaParam;
        }
    }
}
