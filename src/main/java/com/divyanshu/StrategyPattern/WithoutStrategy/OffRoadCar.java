package com.divyanshu.StrategyPattern.WithoutStrategy;

public class OffRoadCar extends Vehicle{
    @Override
    public void drive(){
        System.out.println("HighWay driving mode applied");
    }
}
