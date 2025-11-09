
package com.mycompany.estateapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {
    
    public EstateAgentTest() {
    }

    // Test to calculate commission successfully
    @Test
    public void CalculateCommission_CalculatedSuccessfully() 
    {
        EstateAgent e = new EstateAgent();
        
        double result = e.CalculateCommission("800000", "10");
        assertEquals(80000.0, result, 0.001);
    }

    // Test to calculate commission unsuccessfully
    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() 
    {
        EstateAgent e = new EstateAgent();
        
        double notExpected = 200000.0;
        double actual = e.CalculateCommission("700000", "15");
        
        assertNotEquals(notExpected, actual, 0.001);  
    }
    
    // Validation Test to pick up that there is no estate agent name
    @Test
    public void ValidationTest_NoEstateAgentName()
    {
        EstateAgent e = new EstateAgent();
        Data d = new Data("Durban", "", 700000, 7);
        
        boolean valid = e.ValidateData(d);
        assertFalse(valid);
    }
}
