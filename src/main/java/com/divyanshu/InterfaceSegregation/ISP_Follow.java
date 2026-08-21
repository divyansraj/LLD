package com.divyanshu.InterfaceSegregation;

public class ISP_Follow {
    public static void main(String[] args) {
        nexonEV ev = new nexonEV();
        ev.chargeBattery();

        wagonrPetrol petrol = new wagonrPetrol();
        petrol.refuel();
    }
}

interface electricCar {
    void chargeBattery();
}

interface petrolCar {
    void refuel();
}
class nexonEV implements electricCar{

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery of Nexon EV");
    }
}

class wagonrPetrol implements petrolCar{
    @Override
    public void refuel() {
        System.out.println("Refueling the WagonR Petrol");
    }
}
