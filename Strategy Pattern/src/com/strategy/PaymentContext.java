package com.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    // This is the core of the pattern: dynamically changing the strategy
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null){
            System.err.println("[SYSTEM ERROR] No payment strategy selected!");
            return;
        }

        boolean success = strategy.pay(amount);
        if (success){
            System.out.println("[SUCCESS] Transaction Complete.\n");
        }else{
            System.out.println("[FAILED] Transaction Aborted.\n");
        }
    }
}