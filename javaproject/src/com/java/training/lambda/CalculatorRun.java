package com.java.training.lambda;


public class CalculatorRun {

    public static void main(final String[] args) {
        final Total total = new Total();
        ICalculator calculatorLoc = new Add();
        int calculateLoc = calculatorLoc.calculate(10,
                                                   20);
        System.out.println("Sonuç : " + calculateLoc);

        ICalculator ca1 = new ICalculator() {

            @Override
            public int calculate(final int aParam,
                                 final int bParam) {
                System.out.println("Total : " + total.getTotal());
                int deltaLoc = aParam - bParam;
                total.add(deltaLoc);
                return deltaLoc;
            }
        };

        ICalculator ca3 = new ICalculator() {

            @Override
            public int calculate(final int aParam,
                                 final int bParam) {
                System.out.println("Total : " + total.getTotal());
                int deltaLoc = aParam - bParam;
                total.add(deltaLoc);
                return deltaLoc;
            }
        };

        ICalculator ca2 = (t,
                           p) -> {
            System.out.println("Total : " + total.getTotal());
            int deltaLoc = t - p;
            total.add(deltaLoc);
            return deltaLoc;
        };

        ca2.calculate(20,
                      10);

        ICalculator ca4 = (t,
                           p) -> {
            System.out.println("Total : " + total.getTotal());
            int deltaLoc = t - p;
            total.add(deltaLoc);
            return deltaLoc;
        };
        ca4.calculate(40,
                      30);

        ICalculator ca5 = (r,
                           u) -> r * u;

        int calculate2Loc = ca5.calculate(10,
                                          5);
        System.out.println(calculate2Loc);
        System.out.println("----------------------------");
        ICalculator ca6 = CalculatorRun::xyz;
        int calculate3Loc = ca6.calculate(10,
                                          2);
        System.out.println(calculate3Loc);

        CalculatorRun cr = new CalculatorRun();

        ICalculator ca7 = cr::abc;
        int calculate4Loc = ca7.calculate(20,
                                          30);
        System.out.println(calculate4Loc);


    }

    public int abc(final int h,
                   final int o) {
        return h + o;
    }

    public static int xyz(final int h,
                          final int o) {
        return h / o;
    }
}
