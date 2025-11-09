
package com.mycompany.realestate;

import java.util.Scanner;

public class RealEstate {

    public static void main(String[] args) {
        
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        String[] months = {"January", "February", "March"};
        
        double[][] sales = new double[agents.length][months.length];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < sales.length; i++)
        {
            System.out.println("\nEnter the sales for " + agents[i]);
            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.print(" " + months[j] + ": ");
                sales[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("\nESTATE AGENT SALES REPORT");
        System.out.println("\n\t\t\tJAN\t\t\tFEB\t\t\tMAR");
        System.out.println("------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < agents.length; i++)
        {
            System.out.printf("%-23s", agents[i]);
            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.print("R " + sales[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
        
        double [] totalSales = new double[agents.length];
        double [] commissions = new double [agents.length];
        
        EstateAgent e = new EstateAgent();
        
        for (int i = 0; i < sales.length; i++)
        {
            totalSales[i] = e.EstateAgentSales(sales[i]);
            commissions[i] = e.EstateAgentCommission(totalSales[i]);
        }
        
        System.out.println("Total property sales for Joe Bloggs = R " + totalSales[0]);
        System.out.println("Total property sales for Jane Doe = R " + totalSales[1]);
        
        System.out.println();
        System.out.println("Sales commission for Joe Bloggs = R " + commissions[0]);
        System.out.println("Sales commission for Jane Doe = R " + commissions[1]);
        
        System.out.println();
        
        int index_TopEstateAgent = e.TopEstateAgent(totalSales);
        
        System.out.println("Top performing estate agent: " + agents[index_TopEstateAgent]);
    }
}
