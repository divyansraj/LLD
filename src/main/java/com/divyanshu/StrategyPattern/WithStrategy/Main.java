package com.divyanshu.StrategyPattern.WithStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1= new SedanCar();
        vehicle1.drive();
        Vehicle vehicle2= new SportsCar();
        vehicle2.drive();
        Vehicle vehicle3= new OffRoadCar();
        vehicle3.drive();
    }
}
