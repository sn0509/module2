package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle[] rects=new Rectangle[3];
        rects[0]=new Rectangle(10,20);
        rects[1]=new Rectangle(20,30);
        rects[2]=new Rectangle(30,40);

        System.out.println("Basic: ");
        for (Rectangle rect:rects) {
            System.out.println(rect);
        }

        System.out.println("Resize: ");
        for (Rectangle rect:rects) {
            rect.resize(50);
            System.out.println(rect);
        }
    }
}
