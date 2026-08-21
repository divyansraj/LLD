package com.divyanshu.StrategyPattern.WithStrategy;

import com.divyanshu.StrategyPattern.WithStrategy.DrivingWay.FastCar;

public class SedanCar extends Vehicle{
    public SedanCar(){
        super(new FastCar());
    }
}
