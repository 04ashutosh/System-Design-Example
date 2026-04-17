package com.strategy;

public class PayPalPayment implements PaymentStrategy{
    private String emailId;
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("--- Processing PayPal Payment ---");

        // mock validation
        if (emailId==null || !emailId.contains("@") || !emailId.contains(".com")) {
            System.err.println("[ERROR] Invalid PayPal Associated Email.");
            return false;
        }
        if (password==null || password.isBlank()){
            System.err.println("[ERROR] PayPal password cannot be empty.");
            return false;
        }

        System.out.println("Paid $" + amount + " securely via PayPal using account: "+emailId);
        return true;
    }
}