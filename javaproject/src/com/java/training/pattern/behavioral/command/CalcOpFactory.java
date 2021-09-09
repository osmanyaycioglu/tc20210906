package com.java.training.pattern.behavioral.command;

import java.util.Arrays;
import java.util.List;

public class CalcOpFactory {

    public static List<ICalcOp> getOperations() {
        return Arrays.asList(new CalcOpImpl(() -> "Toplama",
                                            (a,
                                             b) -> a + b),
                             new CalcOpImpl(() -> "Çıkarma",
                                            (a,
                                             b) -> a - b),
                             new CalcOpImpl(() -> "Çarpma",
                                            (a,
                                             b) -> a * b),
                             new CalcOpImpl(() -> "Bölme",
                                            (a,
                                             b) -> {
                                                if (a == 0) {
                                                    return 0;
                                                }
                                                return a / b;
                                            }));
    }

}
