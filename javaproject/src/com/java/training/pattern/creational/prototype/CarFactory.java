package com.java.training.pattern.creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CarFactory {

    private static Map<String, Car> capMap = new ConcurrentHashMap<>();

    public static Car getCar(final String id) {
        Car carLoc = CarFactory.capMap.get(id);
        if (carLoc != null) {
            return carLoc.cloneMe();
        } else {
            // DB yada file yada WS
            Car car = new Car();
            CarFactory.capMap.put(id,
                                  car);
            return car;
        }
    }
}
