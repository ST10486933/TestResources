package com.mycompany.homemakeover;

public class HomeMakeover {

    public static void main(String[] args) {
        
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] makeovers = {
            {8, 2, 5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };
        
        int[] monthlyTotals = new int[months.length];
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------------------------------");
        
        // Print header
        System.out.println("\t\tBathrooms\tKitchens\tGarden");
        
        // Print monthly data and calculate totals
        for (int row = 0; row < makeovers.length; row++) {
            int monthlyTotal = 0;
            System.out.print(months[row] + "\t\t");
            
            for (int column = 0; column < makeovers[row].length; column++) {
                System.out.print(makeovers[row][column] + "\t\t");
                monthlyTotal += makeovers[row][column];
            }
            monthlyTotals[row] = monthlyTotal;
            System.out.println(); // Move to next line after each month
        }
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("------------------------------------------------------------------------");
        
        // Print monthly totals with stars
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + "\t\t" + monthlyTotals[i]);
            
            // Decision statement for stars
            if (monthlyTotals[i] >= 15) {
                System.out.print("\t***");
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------------------------------------------");
    }
}
