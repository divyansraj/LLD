package com.divyanshu.Patterns.FactoryPattern;

public class LegacyCode {
    public void payment(String paymentmode){
        if(paymentmode.equals("PayPal")){
            System.out.println("Paying with PayPal");
            System.out.println("Payment processing......");
            System.out.println("Payment done");
        }
        else if(paymentmode.equals("InternetBanking")){
            System.out.println("Paying with Internet Banking");
            System.out.println("Payment processing......");
            System.out.println("Payment done");
        }
        else if(paymentmode.equals("CreditCard")){
            System.out.println("Paying with Credit Card");
            System.out.println("Payment processing......");
            System.out.println("Payment done");
        }
        else{
            System.out.println("Invalid payment mode");
        }
    }
}

class runner{
    public static void main(String[] args) {
        LegacyCode legacyCode = new LegacyCode();
        legacyCode.payment("PayPal");
        legacyCode.payment("InternetBanking");
        legacyCode.payment("CreditCard");
        legacyCode.payment("InvalidPaymentMode");
    }
}