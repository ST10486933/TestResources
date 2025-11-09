
package com.mycompany.moviegui;

public class MovieTicketData 
{
    public String movieName;
    public int numberOfTickets;
    public double ticketPrice;

    // constructor
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice)
    {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
