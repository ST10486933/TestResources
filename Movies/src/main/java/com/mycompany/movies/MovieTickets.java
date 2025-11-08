
package com.mycompany.movies;

public class MovieTickets implements IMovieTickets
{
    // Method to calculate and return total movie sales
    @Override
    public int TotalMovieSales(int[] movieTicketSales)
    {
        int total = 0;
        for (int sales: movieTicketSales)
        {
            total += sales;
        }
        return total;
    }
    
    // Method to calculate and return the top movie
    @Override
    public String TopMovie(String[] movies, int[] totalSales)
    {
        int max = totalSales[0];
        String topMovie = movies[0];
        
        for (int i = 0; i < totalSales.length; i++)
        {
            if(totalSales[i] > max)
            {
                max = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}
