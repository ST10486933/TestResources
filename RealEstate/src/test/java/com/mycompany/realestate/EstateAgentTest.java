
package com.mycompany.realestate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {
    
    public EstateAgentTest() {
    }
    @Test
    public void CalculateTotalSales_ReturnTotalSales() 
    {
        EstateAgent e = new EstateAgent();
        
        double[] joeSales = {800000, 1500000, 2000000};
        double result = e.EstateAgentSales(joeSales);
        assertEquals(4300000, result, 0.001);
    }

    @Test
    public void CalculateTotalCommission_ReturnCommission() 
    {
        EstateAgent e = new EstateAgent();
        
        double totalSales = 4300000.0;
        double result = e.EstateAgentCommission(totalSales);
        assertEquals(86000, result, 0.001);
    }

    @Test
    public void TopAgent_ReturnsTopPosition() 
    {
        EstateAgent e = new EstateAgent();
        
        double[] totals = {15500.0, 14800.0};
        int expectedIndex = 0;
        int resultIndex = e.TopEstateAgent(totals);
        
        assertEquals(expectedIndex, resultIndex);
    }

    
}
