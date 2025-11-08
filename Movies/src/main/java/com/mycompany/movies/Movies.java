
package com.mycompany.movies;

public class Movies {

    // Main Class
    public static void main(String[] args) 
    {
        // Movie names
        String[] movies = {"Napoleon", "Oppenheimer"};
        
        int[][] sales = 
        {
            //First row sales for Napoleon
            {3000, 1500, 1700}, 
            
            //Second row sales for Oppenheimer
            {3500, 1200, 1600}  
        };
        
        //Single array holding the totals of each row in the 2D array
        int[] totalSales = new int[movies.length];
        
        MovieTickets mt = new MovieTickets();
        
        // Calculate totals per movie
        for (int i = 0; i < movies.length; i++)
        {
            totalSales[i] = mt.TotalMovieSales(sales[i]);
        }
        
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("\n\t\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("-----------------------------------------------------------");

        //For every movie name we want to print out the Sales
        for(int i = 0; i < movies.length; i++ ) //prints out the row value
        {
            System.out.printf("%-23s", movies[i]);
            
            for(int j = 0; j < sales[i].length; j++)//prints out the column value
            {
                System.out.print(sales[i][j] + "\t\t");
            }
            System.out.println();
        }            
        System.out.println();
        
        // Display total movie Sales for each movie
        System.out.println("Total movie ticket sales for Napoleon: " + totalSales[0]);
        System.out.println("Total movie ticket sales for Oppenhemier: " + totalSales[1]);
        
        String topMovie = mt.TopMovie(movies, totalSales);
        
        // Displays top performing movie
        System.out.println();
        System.out.println("Top performing movie: " + topMovie);
    }
    
}