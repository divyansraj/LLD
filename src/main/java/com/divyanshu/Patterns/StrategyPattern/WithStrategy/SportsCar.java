package com.divyanshu.Patterns.StrategyPattern.WithStrategy;

import com.divyanshu.Patterns.StrategyPattern.WithStrategy.DrivingWay.FastCar;

public class SportsCar extends Vehicle{

    public SportsCar(){
        super(new FastCar());
    }
}
