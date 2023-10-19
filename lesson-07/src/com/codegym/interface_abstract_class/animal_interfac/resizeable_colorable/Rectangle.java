package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class Rectangle extends Shape implements  Resizeable,Colorable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void resize(double percent) {
        this.width = getWidth() * percent / 100;
        this.length= getLength() * percent / 100;
    }

    @Override
    public void howToColor() {

    }

    @Override
    public void howToColor(String color) {

    }
}