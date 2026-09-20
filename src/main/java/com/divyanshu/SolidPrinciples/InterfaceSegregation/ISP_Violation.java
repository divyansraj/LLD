package com.divyanshu.SolidPrinciples.InterfaceSegregation;

public class ISP_Violation {
    public static void main(String[] args) {
        marutiEV ev = new marutiEV();
        ev.chargeBattery();
        // ev.refuel(); // This will throw an exception

        marutiPetrol petrol = new marutiPetrol();
        petrol.refuel();
        // petrol.chargeBattery(); // This will throw an exception
    }
}

interface functionalityCar {
    void chargeBattery();
    void refuel();
}

class marutiEV implements functionalityCar {
    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery of Electric Car");
    }

    @Override
    public void refuel() {
        throw new UnsupportedOperationException("Electric Car does not support refueling");
    }
}

class marutiPetrol implements functionalityCar {
    @Override
    public void chargeBattery() {
        throw new UnsupportedOperationException("Petrol Car does not support charging");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the Petrol Car");
    }
}

