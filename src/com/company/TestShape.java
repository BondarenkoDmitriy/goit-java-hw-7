package com.company;

public class TestShape {
    private static String printName(Shape shape) {
        return shape.getShapeName();
    }

    public static void main(String[] args) {
        System.out.println(printName(new Circle()));
    }
}
