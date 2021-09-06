package com.java.training.pattern.creational.factory;

import com.java.training.oo.GreetImpl;
import com.java.training.oo.GreetImplESP;
import com.java.training.oo.GreetImplJP;
import com.java.training.oo.GreetImplTR;
import com.java.training.oo.IGreet;

public class GreetingFactory {

    private static final int GREET_TURKISH = 1;
    private static final int GREET_ENGLISH = 2;
    private static final int GREET_SPANISH = 3;
    private static final int GREET_JAPAN   = 4;

    public static IGreet createGreet(final int index) {
        switch (index) {
            case GREET_TURKISH:
                return new GreetImplTR(GreetingFactory.GREET_TURKISH);
            case GREET_ENGLISH:
                return new GreetImpl(GreetingFactory.GREET_ENGLISH);
            case GREET_SPANISH:
                return new GreetImplESP(GreetingFactory.GREET_SPANISH);
            case GREET_JAPAN:
                return new GreetImplJP(GreetingFactory.GREET_JAPAN);
            default:
                return new GreetImpl(GreetingFactory.GREET_ENGLISH);
        }
    }
}
