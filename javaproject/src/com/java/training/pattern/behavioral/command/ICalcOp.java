package com.java.training.pattern.behavioral.command;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public interface ICalcOp {

    Supplier<String> menu();

    BinaryOperator<Integer> op();

}
