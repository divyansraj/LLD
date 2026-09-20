package com.divyanshu.SolidPrinciples.OpenClosedPrinciple.OCP_NotFollowed;

public class SavingInterface {
    private Shape shape;
    public void savetoDB(Shape shape) {
        System.out.println("Saved to database:"+ shape.calculateArea());
    }
    public void savetoFile(Shape shape) {
        System.out.println("Saved to file: "+ shape.calculateArea());
    }

}