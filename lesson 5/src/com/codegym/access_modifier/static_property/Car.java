package com.codegym.access_modifier.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOFCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOFCars++;
    }
}
