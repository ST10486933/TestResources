
package com.mycompany.movies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() 
    {
        MovieTickets mt = new MovieTickets();
        int[] sales = {3000, 1500, 1700};
        int result = mt.TotalMovieSales(sales);
        assertEquals(6200, result);
    }
    
    @Test
    public void TopMovieSales_ReturnsTopMovie()
    {
        MovieTickets mt = new MovieTickets();
        
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};

        String result = mt.TopMovie(movies, totalSales);
        assertEquals("Oppenheimer", result);
    }
}
