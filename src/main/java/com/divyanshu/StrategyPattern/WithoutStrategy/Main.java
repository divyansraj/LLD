package com.divyanshu.StrategyPattern.WithoutStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1= new SedanCar();
        vehicle1.drive();
        Vehicle vehicle2= new SportsCar();
        vehicle2.drive();
        Vehicle vehicle3= new OffRoadCar();// here we are overriding same thing at two place, means duplicate code
        vehicle3.drive();
    }
}
