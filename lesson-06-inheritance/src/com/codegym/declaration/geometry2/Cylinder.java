package com.codegym.declaration.geometry2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
    public String toString(){
        return "A Cylinder with radius="
                + radius
                + ", which is a subclass of "
                + super.toString();
    }
}
