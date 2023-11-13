package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class Circle extends Shape implements Resizeable,Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void resize(double percent) {
        this.radius = getRadius() * percent/100;
    }

    @Override
    public void howToColor() {

    }

    @Override
    public void howToColor(String color) {

    }
}
