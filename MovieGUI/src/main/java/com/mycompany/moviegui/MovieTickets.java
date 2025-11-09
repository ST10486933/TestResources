
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
        if(movieTicketData.getMovieName().isEmpty())
        {
            return false;
        }
        
        if(movieTicketData.getNumberOfTickets() <=0)
        {
            return false;
        }
        
        if(movieTicketData.getTicketPrice() <=0)
        {
            return false;
        }
        
        return true;
    }

}
