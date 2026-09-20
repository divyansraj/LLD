package com.divyanshu.Patterns.StrategyPattern.WithStrategy;

import com.divyanshu.Patterns.StrategyPattern.WithStrategy.DrivingWay.FastCar;

public class SedanCar extends Vehicle{
    public SedanCar(){
        super(new FastCar());
    }
}
