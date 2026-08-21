package com.divyanshu.StrategyPattern.WithStrategy;

import com.divyanshu.StrategyPattern.WithStrategy.DrivingWay.TypeofCar;

public class Vehicle {
    public TypeofCar typeofCar;
    public Vehicle(TypeofCar typeofCar) {
        this.typeofCar = typeofCar;
    }
    public void drive(){
        typeofCar.drive();
    }
}
