package com.divyanshu.OOPS;

public class ElectricCar extends Car{
    private int acceleration;

    public ElectricCar(String model, String color) {
        super(model, color, 4, "Electric");
        this.acceleration=0;
    }
    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
        accelerate(acceleration);
    }
    public int getAcceleration() {
        return acceleration;
    }
    @Override
    public void accelerate() {
        System.out.println("Electric Car is accelerating at speed: " + acceleration);
    }

    @Override
    public void accelerate(int speed) {
        acceleration+=speed;
        System.out.println("Electric Car is accelerating at speed: " + acceleration);
    }
}
