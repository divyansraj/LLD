package com.divyanshu.Patterns.FactoryPattern;

public class FactoryMethodPattern {
    // Legacy Code => Simple Factory=> Factory Method Pattern(Here we removed the if-else statements and created a factory for each payment type)
    // then we passed the factory object to the processPaymentWithFactory method to create the payment object based on the type passed as a parameter

    interface Payment {
        void pay();
        String getPaymentType();
    }

    // parent factory
    static abstract class PaymentProcessorFactory{
        public abstract Payment createPayment();
    }

    // concrete factory for Internet Banking
    static class InternetBankingFactory extends PaymentProcessorFactory{
        @Override
        public Payment createPayment() {
            return new InternetBanking();
        }
    }
    static class InternetBanking implements Payment {

        @Override
        public void pay() {
            System.out.println("Paying with Internet Banking");
            System.out.println("Payment processing......");
            System.out.println("Payment done");
        }

        @Override
        public String getPaymentType() {
            return "Internet Banking";
        }
    }

    //concrete factory for PayPal
    static class PaypalFactory extends PaymentProcessorFactory{
        @Override
        public Payment createPayment() {
            return new PayPal();
        }
    }

    static class PayPal implements Payment {
        @Override
        public void pay() {
            System.out.println("Paying with PayPal");
            System.out.println("Payment processing......");
            System.out.println("Payment done");
        }

        @Override
        public String getPaymentType() {
            return "PayPal";
        }
    }

    //no need to create a factory for each payment type, we can use a simple factory method to
    // create the payment object based on the type passed as a parameter

    private static void processPaymentWithFactory(PaymentProcessorFactory factory) {
        Payment payment = factory.createPayment();
        System.out.println("Payment type: " + payment.getPaymentType());
        payment.pay();
    }

    public static void main(String[] args) {
        processPaymentWithFactory(new InternetBankingFactory());
    }

}