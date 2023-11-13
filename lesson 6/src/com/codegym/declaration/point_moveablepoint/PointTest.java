package com.codegym.declaration.point_moveablepoint;

public class PointTest {
    public static void main(String[] args) {
        var test = new MovablePoint(1f, 1f, 1f,1f);
        test.move();
        test.move();
        System.out.println(test.toString());
    }
}
