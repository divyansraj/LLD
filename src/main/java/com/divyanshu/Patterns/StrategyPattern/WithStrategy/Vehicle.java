package com.divyanshu.Patterns.StrategyPattern.WithStrategy;

import com.divyanshu.Patterns.StrategyPattern.WithStrategy.DrivingWay.TypeofCar;

public class Vehicle {
    public TypeofCar typeofCar;
    public Vehicle(TypeofCar typeofCar) {
        this.typeofCar = typeofCar;
    }
    public void drive(){
        typeofCar.drive();
    }
}
