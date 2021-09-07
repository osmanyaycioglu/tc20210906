package com.java.training.calculator;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public interface ICalcOp {

    Supplier<String> menu();

    BinaryOperator<Integer> op();

}
