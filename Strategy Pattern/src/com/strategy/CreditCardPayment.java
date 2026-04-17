package com.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String nameOnCard;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String nameOnCard, String cardNumber, String cvv, String dateOfExpiry) {
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("--- Processing Credit Card Payment ---");

        // Simple mock validation
        if (cardNumber==null || cardNumber.length()!=16){
            System.err.println("[ERROR] Invalid Card Number! Must be 16 digits.");
            return false;
        }
        if (cvv==null || cvv.length()!=3){
            System.err.println("[ERROR] Invalid CVV! Must be 3 digits.");
            return false;
        }

        System.out.println("Paid $" + amount + " smoothly using Credit Card ending in " + cardNumber.substring(12, 16) + ".");
        return true;
    }
}