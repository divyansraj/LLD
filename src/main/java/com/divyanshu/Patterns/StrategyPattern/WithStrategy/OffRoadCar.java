package com.divyanshu.Patterns.StrategyPattern.WithStrategy;

import com.divyanshu.Patterns.StrategyPattern.WithStrategy.DrivingWay.NormalCar;

public class OffRoadCar extends Vehicle{
    public OffRoadCar(){
        super(new NormalCar());
    }
}
