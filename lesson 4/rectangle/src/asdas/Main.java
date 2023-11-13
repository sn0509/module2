package asdas;

import asdasdasd.Rectangle;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the width: ");
//        double width = scanner.nextDouble();
//        System.out.println("Enter the height: ");
//        double height = scanner.nextDouble();
//        asdasdasd.Rectangle rectangle = new asdasdasd.Rectangle(width, height);
//        asdasdasd.Rectangle rectangle1 = new asdasdasd.Rectangle();
//        System.out.println("Your asdasdasd.Rectangle \n"+ rectangle.display());
//        System.out.println("Perimeter of the asdasdasd.Rectangle: "+ rectangle.getPerimeter());
//        System.out.println("Area of the asdasdasd.Rectangle: "+ rectangle.getArea());

//        var rectangle1 = new asdasdasd.Rectangle();
//        System.out.println(rectangle1.getWidth() + "x" + rectangle1.getHeight());
//        rectangle1.setWidth(5);
//        rectangle1.setHeight(10);
//
//        System.out.println(rectangle1.getWidth() + "x" + rectangle1.getHeight());
//        var rectangle2 = new asdasdasd.Rectangle( 7, 14);
//
//        System.out.println(rectangle2.getWidth() + "x" + rectangle2.getHeight());

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(scanner.nextInt());
        rectangle.setHeight(scanner.nextInt());
        System.out.println(rectangle.getArea());

        System.out.println(rectangle.getWidth());
    }
}