package com.divyanshu.OpenClosedPrinciple.OCP_NotFollowed;

public class Main {
    public static void main(String[] args) {
        ShapeCircle circle = new ShapeCircle(10000);
        System.out.println(circle.calculateArea());
        SavingInterface s = new SavingInterface();
        s.savetoDB(circle);
        s.savetoFile(circle);
    }
}
