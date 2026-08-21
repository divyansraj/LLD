package com.divyanshu.OOPS;

public abstract class Car {
    public String model;
    public String color;
    private int seater;
    private String typeofEngine;

    public Car(String model, String color, int seater, String typeofEngine) {
        this.model = model;
        this.color = color;
        this.seater = seater;
        this.typeofEngine = typeofEngine;
    }

    //getter and setter
    public String getSeater() {
        return seater + "";
    }
    public String getTypeofEngine() {
        return typeofEngine;
    }
    public void setSeater(int seater) {
        this.seater = seater;
    }
    public void setTypeofEngine(String typeofEngine) {
        this.typeofEngine = typeofEngine;
    }

    // accessible to all the subclasses
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }

    // abstract methods to be implemented by subclasses
    public abstract void accelerate();
    public abstract void accelerate(int speed);

}
