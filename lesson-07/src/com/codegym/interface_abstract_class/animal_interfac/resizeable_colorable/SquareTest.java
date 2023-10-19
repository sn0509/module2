package com.codegym.interface_abstract_class.animal_interfac.resizeable_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] square=new Square[3];
        square[0]=new Square(5, "red", false);
        square[1]=new Square(7, "red", true);
        square[2]=new Square(12);

        System.out.println("Original: ");
        for(Square s:square){
            System.out.println(s);
        }

        System.out.println("Colorable: ");
        for(Square s:square){
            if(s != null && s.isFilled()){
                s.howToColor(s.getColor());
            }
        }
    }
}
