package com.divyanshu.OpenClosedPrinciple.OCP_NotFollowed;

import com.divyanshu.OpenClosedPrinciple.OCP_NotFollowed.Shape;

public class SavingInterface {
    private Shape shape;
    public void savetoDB(Shape shape) {
        System.out.println("Saved to database:"+ shape.calculateArea());
    }
    public void savetoFile(Shape shape) {
        System.out.println("Saved to file: "+ shape.calculateArea());
    }

}