package com.divyanshu.StrategyPattern.WithStrategy.DrivingWay;

public class NormalCar implements TypeofCar {
    @Override
    public void drive() {
        System.out.println("Driving normal car");
    }
}
