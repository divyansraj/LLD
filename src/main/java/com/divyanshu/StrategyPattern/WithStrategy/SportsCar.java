package com.divyanshu.StrategyPattern.WithStrategy;

import com.divyanshu.StrategyPattern.WithStrategy.DrivingWay.FastCar;

public class SportsCar extends Vehicle{

    public SportsCar(){
        super(new FastCar());
    }
}
