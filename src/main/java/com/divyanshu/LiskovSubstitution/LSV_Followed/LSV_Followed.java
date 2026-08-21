package com.divyanshu.LiskovSubstitution.LSV_Followed;

class BroadbandJio extends broadbandPlans implements featureCallingVoice,featureOTTApps,featureTvChannels{

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
class BroadbandAirtel extends broadbandPlans implements featureCallingVoice,featureOTTApps{

    @Override
    public void calling() {
        System.out.println("Your plan includes free calling");
    }

    @Override
    public void ott() {
        System.out.println("Your plan includes free access to OTT apps");
    }
}

abstract class broadbandPlans{
    public void unlimitedInternet(){
        System.out.println("Your plan includes Unlimited Internet");
    }
}
interface featureCallingVoice{
    public void calling();
}
interface featureOTTApps{
    public void ott();
}
interface featureTvChannels{
    public void tv();
}

class LSV_Followed {
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
    }
}
