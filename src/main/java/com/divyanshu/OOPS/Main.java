package com.divyanshu.OOPS;

public class Main {
    public static void main(String[] args) {
       ElectricCar ec1 = new ElectricCar("Tesla M3","White");
       ec1.start();
       ec1.accelerate();
       ec1.accelerate(20);
        System.out.println("Car Seater: " + ec1.getSeater());
        System.out.println("Car Engine Type: " + ec1.getTypeofEngine());
       ec1.setAcceleration(20);
       ec1.setSeater(6);
       ec1.getSeater();
       ec1.stop();

//       ElectricCar ec2 = new ElectricCar("Tesla T2 PRO","Black");
//       ec2.start();
//       ec2.accelerate();
//       ec2.accelerate(20);
//        System.out.println("Car Seater: " + ec2.getSeater());
//        System.out.println("Car Engine Type: " + ec2.getTypeofEngine());
//       ec2.stop();
//
//       PetrolCar pc1 = new PetrolCar("BMW M3","Red");
//       pc1.start();
//       pc1.accelerate();
//       pc1.accelerate(20);
//        System.out.println("Car Seater: " + pc1.getSeater());
//        System.out.println("Car Engine Type: " + pc1.getTypeofEngine());
//       pc1.stop();
    }
}
