package com.mycompany.paymentprocessing;

public class EftPayment extends Payment {
    public EftPayment(String name, double amount) 
    {
        super(name, amount);
    }

    @Override
    public double calculateFee() {
        return 5.00; 
    }
}
