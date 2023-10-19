package com.codegym.declaration.tostring;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle of radius " + radius;
    }
}
