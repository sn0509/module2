package com.codegym.access_modifier.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
