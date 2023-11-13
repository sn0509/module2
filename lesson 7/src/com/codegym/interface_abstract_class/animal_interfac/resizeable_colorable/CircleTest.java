package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class CircleTest {
    public static void main(String[] args) {

        Circle[] circles= new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(4.5);
        circles[2] = new Circle(5);

        System.out.println("Original: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("resized 50%");
        for (Circle circle : circles) {
            circle.resize(50);
            System.out.println(circle);
        }




    }
}