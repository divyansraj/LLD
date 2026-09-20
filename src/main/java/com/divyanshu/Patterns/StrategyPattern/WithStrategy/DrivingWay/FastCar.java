package com.divyanshu.Patterns.StrategyPattern.WithStrategy.DrivingWay;

public class FastCar implements TypeofCar {
    @Override
    public void drive() {
        System.out.println("Driving fast car");
    }
}
