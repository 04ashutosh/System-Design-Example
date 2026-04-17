package com.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("         Strategy Pattern Demo            ");
        System.out.println("==========================================");

        // Client prepares the context
        PaymentContext checkout = new PaymentContext();
        double cartTotal = 250.75;

        // SCENARIO 1: Client chooses to pay with Credit Card
        System.out.println("\n>>> User selects Credit Card checkout...");
        PaymentStrategy ccStrategy = new CreditCardPayment("John Doe","1234567890123456","123","12/25");

        checkout.setPaymentStrategy(ccStrategy);
        checkout.executePayment(cartTotal);

        // SCENARIO 2: Client changes mind, switches to UPI at runtime
        System.out.println(">>> User changes mind, switches to UPI...");
        PaymentStrategy upiStrategy = new UPIPayment("johndoe@ybl");

        checkout.setPaymentStrategy(upiStrategy);
        checkout.executePayment(cartTotal);

        // SCENARIO 3: Let's test the validation logic (Invalid PayPal)
        System.out.println(">>> Testing validation: User uses malformed PayPal email...");
        PaymentStrategy paypalStrategy = new PayPalPayment("johndoe-at-gmail","secret123");

        checkout.setPaymentStrategy(paypalStrategy);
        checkout.executePayment(cartTotal);
    }
}