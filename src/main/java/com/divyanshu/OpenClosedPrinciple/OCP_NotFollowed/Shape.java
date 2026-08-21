package com.divyanshu.OpenClosedPrinciple.OCP_NotFollowed;

public interface Shape {
    double calculateArea();
}

class ShapeCircle implements Shape{
    private final  int radius;
    public ShapeCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class ShapeRectangle implements Shape{
    private final double length;
    private final double width;
    public ShapeRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}



