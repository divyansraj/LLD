package com.divyanshu.LiskovSubstitution.LSV_NotFollowed;

class BroadbandJio extends broadbandPlans {

    @Override
    public void calling() {
        System.out.println("Your plan includes free calling");
    }

    @Override
    public void ott() {
        System.out.println("Your plan includes free access to OTT apps");
    }

    @Override
    public void tv() {
        System.out.println("Your plan includes free access to TV channels");
    }
}
class BroadbandAirtel extends broadbandPlans {

    @Override
    public void calling() {
        System.out.println("Your plan includes free calling");
    }

    @Override
    public void ott() {
        System.out.println("Your plan includes free access to OTT apps");
    }

    @Override
    public void tv() {
        throw new UnsupportedOperationException("TV feature is not supported in this plan");
    }
}

abstract class broadbandPlans{
    public void unlimitedInternet(){
        System.out.println("Your plan includes Unlimited Internet");
    }
    public abstract void calling();
    public abstract void ott();
    public abstract void tv();
}

class LSV_NotFollowed {
    public static void main(String[] args) {
        BroadbandJio jio = new BroadbandJio();
        jio.unlimitedInternet();
        jio.calling();
        jio.ott();
        jio.tv();

        System.out.println("--------------------------------");

        BroadbandAirtel airtel = new BroadbandAirtel();
        airtel.unlimitedInternet();
        airtel.calling();
        airtel.ott();
        airtel.tv();
    }
}

