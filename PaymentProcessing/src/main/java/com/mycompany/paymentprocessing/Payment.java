
package com.mycompany.paymentprocessing;

public abstract class Payment {
    
    private String name;
    private double amount;

    public Payment(String name, double amount) 
    {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public abstract double calculateFee();
    
    public double getTotal() {
        return amount + calculateFee();
    }
}
