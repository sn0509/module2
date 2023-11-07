package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public void resize(int width, int height) {

            }

            @Override
            public void howToColor() {

            }
        };
        System.out.println(shape);

        shape = new Shape("red", false) {
            @Override
            public void resize(int width, int height) {

            }

            @Override
            public void howToColor() {

            }
        };
        System.out.println(shape);
    }
}
