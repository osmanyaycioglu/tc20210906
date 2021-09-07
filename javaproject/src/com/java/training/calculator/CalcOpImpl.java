package com.java.training.calculator;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class CalcOpImpl implements ICalcOp {

    private final Supplier<String>        menu;
    private final BinaryOperator<Integer> op;

    public CalcOpImpl(final Supplier<String> menuParam,
                      final BinaryOperator<Integer> opParam) {
        super();
        this.menu = menuParam;
        this.op = opParam;
    }

    @Override
    public Supplier<String> menu() {
        return this.menu;
    }

    @Override
    public BinaryOperator<Integer> op() {
        return this.op;
    }


}
