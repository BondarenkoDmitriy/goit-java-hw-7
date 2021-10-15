package com.company;

public class TestShape {
    public static String printName(Shape shape) {
        return shape.getShapeName();
    }

    public static void main(String[] args) {
        System.out.println(new TestShape().printName(new Circle()));
    }
}
