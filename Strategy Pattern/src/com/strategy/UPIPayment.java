package com.strategy;

public class UPIPayment implements PaymentStrategy{
    private String upiId;

    public UPIPayment(String upiId){
        this.upiId = upiId;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("--- Processing UPI Payment ---");

        // Simple mock validation
        if (upiId==null || !upiId.contains("@")){
            System.err.println("[ERROR] Invalid UPI ID format. Missing '@' symbol.");
            return false;
        }

        System.out.println("Paid $" + amount + " instantly using UPI ID: " + upiId);
        return true;
    }
}