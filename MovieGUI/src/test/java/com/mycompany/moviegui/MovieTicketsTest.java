
package com.mycompany.moviegui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }

    // Test to see if ticket price is calculated successfully
    @Test
    public void testCalculateTotalTicketPrice_CalculatedSuccessfully() 
    {
        MovieTickets mt = new MovieTickets();
        
        int numberOfTickets = 3;
        double price = 100.0;
        double result = mt.CalculateTotalTicketPrice(numberOfTickets, price);
        
        assertEquals(342.0 ,result, 0.001);
    }

    // Test to show validation is successful
    @Test
    public void testValidateData_Successful() 
    {
        MovieTickets mt = new MovieTickets();
        MovieTicketData md = new MovieTicketData("Napoleon", 2, 250);
        
        boolean result = mt.ValidateData(md);
        assertTrue(result);
    }
    
    // Test to show check wrong number of tickets is unsuccessful
    @Test
    public void testValidateData_Unsuccessful_WrongNumberOfTickets()
    {
        MovieTickets mt = new MovieTickets();
        MovieTicketData md = new MovieTicketData("Napoleon", 0, 250);
        
        boolean invalid = mt.ValidateData(md);
        assertFalse(invalid);
    }
}
