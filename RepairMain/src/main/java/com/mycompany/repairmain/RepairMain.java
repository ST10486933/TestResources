
package com.mycompany.repairmain;

import java.util.Scanner;

public class RepairMain {

    public static void main(String[] args) {
        
        String techs [] = {"Joe Bloggs", "Jane Doe"};
        String months [] = {"January", "February", "March"};
        
        double[][] repairs = new double[techs.length][months.length];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < repairs.length; i++)
        {
            System.out.println("\nEnter repairs for " + techs[i]);
            for (int j = 0; j < repairs[i].length; j++)
            {
                System.out.print(" " + months[j] + ": ");
                repairs[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("\nTECHNICIAN VEHICLE REPAIR REPORT");
        System.out.println("\n\t\t\tJAN\t\t\tFEB\t\t\t\tMAR");
        System.out.println("---------------------------------------------------------------------------------------");
        
        for(int i = 0; i < techs.length; i++)
        {
            System.out.printf("%-23s", techs[i]);
            
            for (int j = 0; j < repairs[i].length; j++)
            {
                System.out.print("R " + repairs[i][j] + "\t\t\t");
            }
            System.out.println();
        }
        System.out.println();
        
        double[] totalRepairs = new double[techs.length];
        double[] commissions = new double[techs.length];
        
        Repairs r = new Repairs();
        
        for (int i = 0; i < repairs.length; i++)
        {
            totalRepairs[i] = r.RepairCosts(repairs[i]);
            commissions[i] = r.TechnicianPay(totalRepairs[i]);
        }
        
        System.out.println("Total vehicle repairs for Joe Bloggs = R " + totalRepairs[0]);
        System.out.println("Total vehicle repairs for Jane Doe = R " + totalRepairs[1]);
        
        System.out.println();
        System.out.println("Repair Commission for Joe Bloggs = R " + commissions[0]);
        System.out.println("Repair Commission for Jane Doe = R " + commissions[1]);
        
        System.out.println();
        
        int index_TopTechnician = r.TopTechnician(totalRepairs);
        
        System.out.println("Top performing vehicle technician: " + techs[index_TopTechnician]);
    }
}
