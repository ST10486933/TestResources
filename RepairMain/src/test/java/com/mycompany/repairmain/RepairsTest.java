
package com.mycompany.repairmain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RepairsTest 
{
    private final Repairs r = new Repairs();
    
    public RepairsTest() {
    }

    @Test
    public void CalculateCosts_ReturnsRepairCosts() 
    {
        double [] joeRepairs = {8000, 2500, 5000};
        double result = r.RepairCosts(joeRepairs);
        assertEquals(15500, result, 0.001);
    }

    @Test
    public void CalculatePay_ReturnsExpectedPay() 
    {
        double totalRepairs = 15500.0;
        double result = r.TechnicianPay(totalRepairs);
        assertEquals(1550, result, 0.001);
    }

    @Test
    public void TopTechnician_ReturnsTopPosition() 
    {
        double [] totals = {15500.0, 14800.0};
        int expectedIndex = 0;
        int resultIndex = r.TopTechnician(totals);
        
        assertEquals(expectedIndex, resultIndex);
    }
    
}
