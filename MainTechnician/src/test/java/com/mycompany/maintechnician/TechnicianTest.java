
package com.mycompany.maintechnician;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TechnicianTest {
    
    public TechnicianTest() {
    }

    Technician t = new Technician();
    
    @Test
    public void CalculatePay_PayCalculatedSuccessfully() 
    {
        double result = t.CalculatePay("1500", "10");
        assertEquals(150.0, result, 0.001);
    }

    @Test
    public void CalculatePay_PayCalculatedUnSuccessfully()
    {
        double notExpected = 700.0;
        double actual = t.CalculatePay("1500", "0.5");
        
        assertNotEquals(notExpected, actual, 0.001);
    }
    
    @Test
    public void ValidationTest_InvalidRepairCost() 
    {
        Data d = new Data("Durban", "Alex", 0, 0.5);
        boolean valid = t.ValidateData(d);
        
        assertFalse(valid);
    }
    
}
