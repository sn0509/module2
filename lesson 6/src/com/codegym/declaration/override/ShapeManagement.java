package com.codegym.declaration.override;

public class ShapeManagement {
    public static void main(String[] args) {

        Shape shape = new Shape("test 1");
        shape.getName();

        Rectangle s = new Rectangle("test 2");
        s.getName();
    }
}
