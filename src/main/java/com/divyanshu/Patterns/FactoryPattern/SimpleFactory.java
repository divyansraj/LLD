package com.divyanshu.Patterns.FactoryPattern;

public class SimpleFactory {

    // Legacy Code => Simple Factory(Here we simply separated the payment logic into different classes)
    // then we can use the factory method pattern to create the payment object based on the type passed as a parameter


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

    // Simple Factory class to create payment objects based on the type passed as a parameter
    static class SimplePaymentFactory {
        public Payment createPayment(String type) {

            if (type.equalsIgnoreCase("PayPal"))
            {
                return new PayPal();
            }
            else if (type.equalsIgnoreCase("InternetBanking"))
            {
                return new InternetBanking();
            }
            else
            {
                throw new IllegalArgumentException("Invalid payment type");
            }
        }
    }

    private static void processPaymentWithFactory(PaymentProcessorFactory factory) {
        Payment payment = factory.createPayment();
        System.out.println("Payment type: " + payment.getPaymentType());
        payment.pay();
    }

    public static void main(String[] args) {
        processPaymentWithFactory(new InternetBankingFactory());
    }

}