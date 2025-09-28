
package com.mycompany.paymentprocessing;

public class PaymentProcessing {
    public static void main(String[] args) {
        
        Payment[] payments = {
            new CardPayment("Thandi", 1200.00),
            new EftPayment("Musa", 800.00),
            new CardPayment("Aisha", 1500.00)
        };

        System.out.println("=== Course Payments ===");

        double grandTotal = 0;

        for (Payment p : payments) {
            double fee = p.calculateFee();
            double total = p.getTotal();

            System.out.println("Name: " + p.getName() + " | Amount: R" + p.getAmount() + " | Fee: R" + p.calculateFee() + " | Total: R" + p.getTotal());

            grandTotal += total;
        }

        System.out.println("\nGrand Total Collected: R" + grandTotal);
    }
}
