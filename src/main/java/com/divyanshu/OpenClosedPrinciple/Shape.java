package com.divyanshu.OpenClosedPrinciple;

public class Shape {
    String shape;
    int length;
    int width;

    public Shape(String shape, int length, int width) {
        this.shape = shape;
        this.length = length;
        this.width = width;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}
