package com.divyanshu.SolidPrinciples.OpenClosedPrinciple.OCP;

public interface SavingInterface {
    public void save(Shape shape);
}

class SavetoDB implements SavingInterface {
    @Override
    public void save(Shape shape) {
        System.out.println("Saved to database:"+ shape.calculateArea());
    }
}

class SavetoFile implements SavingInterface{
    @Override
    public void save(Shape shape) {
        System.out.println("Saved to file: "+ shape.calculateArea());
    }
}
