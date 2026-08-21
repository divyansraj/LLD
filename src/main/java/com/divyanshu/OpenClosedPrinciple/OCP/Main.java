package com.divyanshu.OpenClosedPrinciple.OCP;

public class Main {
    public static void main(String[] args) {
        ShapeCircle circle = new ShapeCircle(10000);
        System.out.println(circle.calculateArea());
        SavetoDB save = new SavetoDB();
        SavetoFile save2 = new SavetoFile();
        save.save(circle);
        save2.save(circle);
    }
}
