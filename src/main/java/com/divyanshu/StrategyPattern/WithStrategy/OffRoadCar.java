package com.divyanshu.StrategyPattern.WithStrategy;

import com.divyanshu.StrategyPattern.WithStrategy.DrivingWay.NormalCar;

public class OffRoadCar extends Vehicle{
    public OffRoadCar(){
        super(new NormalCar());
    }
}
