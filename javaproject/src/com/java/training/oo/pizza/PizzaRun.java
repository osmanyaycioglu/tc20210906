package com.java.training.oo.pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PizzaRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            Pizza pizza = new Pizza();
            xyz:
            while (true) {
                System.out.println("extra : ");
                String nextLineLoc = scannerLoc.nextLine();
                if (nextLineLoc.equals("exit")) {
                    break xyz;
                }
                pizza = PizzaFactory.addToPizza(pizza,
                                                nextLineLoc);
            }
            System.out.println("Total : " + pizza.price());
            System.out.println("pizza : " + pizza.ingrid());
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }

    public static void main2(final String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("peynir",
                10);
        map.put("mantar",
                7);
        map.put("zeytin",
                6);
        map.put("misir",
                5);
        map.put("peperoni",
                20);
        map.put("sucuk",
                15);

        try (Scanner scannerLoc = new Scanner(System.in)) {
            List<String> extraList = new ArrayList<>();
            xyz:
            while (true) {
                System.out.println("extra : ");
                String nextLineLoc = scannerLoc.nextLine();
                if (nextLineLoc.equals("exit")) {
                    break xyz;
                }
                extraList.add(nextLineLoc);
            }
            int total = 0;
            String pizzaLoc = "";
            for (String stringLoc : extraList) {
                Integer integerLoc = map.get(stringLoc);
                if (integerLoc != null) {
                    total += integerLoc;
                    pizzaLoc += stringLoc + " ";
                }
            }
            System.out.println("Total : " + total);
            System.out.println("pizza : " + pizzaLoc);
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }

}
