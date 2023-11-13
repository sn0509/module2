package com.codegym.access_modifier.static_property;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOFCars);
        Car c2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOFCars);

    }
}
