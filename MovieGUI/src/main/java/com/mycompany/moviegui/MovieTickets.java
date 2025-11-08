
package com.mycompany.moviegui;

public class MovieTickets implements IMovieTickets{
    
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice)
    {
        double normalPrice = ticketPrice * numberOfTickets;
        double VAT_price = normalPrice * 0.14;
        double finalPrice = VAT_price + normalPrice;
        
        return finalPrice;
    }
    
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData)
    {
        if(movieTicketData.movieName.isEmpty())
        {
            return false;
        }
        
        if(movieTicketData.numberOfTickets <=0)
        {
            return false;
        }
        
        if(movieTicketData.ticketPrice <=0)
        {
            return false;
        }
        
        return true;
    }

}
