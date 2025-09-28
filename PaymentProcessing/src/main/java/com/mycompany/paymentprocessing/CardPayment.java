package com.mycompany.paymentprocessing;

public class CardPayment extends Payment {
    public CardPayment(String name, double amount) {
        super(name, amount);
    }

    @Override
    public double calculateFee() {
        return (getAmount() * 0.025) + 2.50; 
    }
}