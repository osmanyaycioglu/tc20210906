package com.java.training.calculator;

import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(final String[] args) {
        List<ICalcOp> operationsLoc = CalcOpFactory.getOperations();
        try (Scanner s = new Scanner(System.in)) {
            mr:
            while (true) {
                for (int iLoc = 1; iLoc < (operationsLoc.size() + 1); iLoc++) {
                    ICalcOp iCalcOpLoc = operationsLoc.get(iLoc - 1);
                    System.out.println(iLoc
                                       + "-"
                                       + iCalcOpLoc.menu()
                                                   .get());
                }
                System.out.println("Seçiminiz:");
                int opIndex = s.nextInt();
                System.out.println("value1:");
                int value1 = s.nextInt();
                System.out.println("value2:");
                int value2 = s.nextInt();
                if (opIndex > operationsLoc.size()) {
                    continue mr;
                }
                ICalcOp iCalcOpLoc = operationsLoc.get(opIndex - 1);
                Integer result = iCalcOpLoc.op()
                                           .apply(value1,
                                                  value2);
                System.out.println("Sonuç : " + result);
                System.out.println("-----------");
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public static void main2(final String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            mr:
            while (true) {
                System.out.println("1-Toplama");
                System.out.println("2-Çıkarma");
                System.out.println("Seçiminiz:");
                int opIndex = s.nextInt();
                System.out.println("value1:");
                int value1 = s.nextInt();
                System.out.println("value2:");
                int value2 = s.nextInt();
                int result = 0;
                switch (opIndex) {
                    case 1:
                        result = value1 + value2;
                        break;
                    case 2:
                        result = value1 - value2;
                        break;
                    default:
                        continue mr;
                }
                System.out.println("Sonuç : " + result);
                System.out.println("-----------");
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
