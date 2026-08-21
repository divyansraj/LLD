package com.divyanshu.OOPS;

public class PetrolCar extends Car {
    private int acceleration;

    public PetrolCar(String model, String color) {
        super(model,color,4,"Petrol");
        this.acceleration=0;
    }
    public int getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
        accelerate(acceleration);
    }

    @Override
    public void accelerate() {
        System.out.println("Petrol Car is accelerating at speed: " + acceleration);
    }
    @Override
    public void accelerate(int speed) {
        acceleration+=speed;
        System.out.println("Petrol Car is accelerating at speed: " + acceleration);
    }
}
