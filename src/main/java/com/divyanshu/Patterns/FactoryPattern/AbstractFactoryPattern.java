package com.divyanshu.Patterns.FactoryPattern;

public class AbstractFactoryPattern {
    // Legacy Code => Simple Factory=> Factory Method Pattern => Abstract Factory Pattern( Here we can add more functionality to payment processor like refund, cancel etc.)
    // then we can create a concrete factory for each payment type and create the payment object based on the type passed as a parameter
    interface Payment {
        void pay();
        String getPaymentType();
    }

    interface Refund{
        void initiateRefund();
    }

    // parent factory
    static abstract class PaymentProcessorFactory{
        public abstract Payment createPayment();
        public abstract Refund createRefund();
    }

    // concrete factory for Internet Banking
    static class InternetBankingFactory extends PaymentProcessorFactory{
        @Override
        public Payment createPayment() {
            return new InternetBanking();
        }

        @Override
        public Refund createRefund() {
            return new InternetBankingRefund();
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

    static class InternetBankingRefund implements Refund{
        @Override
        public void initiateRefund() {
            System.out.println("Initiating refund for Internet Banking");
            System.out.println("Refund processing......");
            System.out.println("Refund done");
        }
    }

    //concrete factory for PayPal
    static class PaypalFactory extends PaymentProcessorFactory{
        @Override
        public Payment createPayment() {
            return new PayPal();
        }

        @Override
        public Refund createRefund() {
            return new PayPalRefund();
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
    static class PayPalRefund implements Refund{
        @Override
        public void initiateRefund() {
            System.out.println("Initiating refund for PayPal");
            System.out.println("Refund processing......");
            System.out.println("Refund done");
        }
    }

    //no need to create a factory for each payment type, we can use a simple factory method to
    // create the payment object based on the type passed as a parameter

    private static void processPaymentWithFactory(PaymentProcessorFactory factory) {
        Payment payment = factory.createPayment();
        System.out.println("Payment type: " + payment.getPaymentType());
        payment.pay();
    }

    private static void processRefundWithFactory(PaymentProcessorFactory factory) {
        Refund refund = factory.createRefund();
        System.out.println("Refund type: " + refund.getClass().getSimpleName());
        refund.initiateRefund();
    }

    public static void main(String[] args) {
        processPaymentWithFactory(new InternetBankingFactory());
        processRefundWithFactory(new InternetBankingFactory());
        processPaymentWithFactory(new PaypalFactory());
        processRefundWithFactory(new PaypalFactory());
    }

}