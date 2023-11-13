package com.codegym.declaration.override;

public class Rectangle extends Shape {

    public Rectangle(String name){
        super(name);
    }
    protected void getName() {
//         System.out.println("I am a rectangle");
        super.getName();
    }
}
