
package com.mycompany.roadaccidentreport;

import java.util.Scanner;

public class RoadAccidentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare arrays to store the accident data
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[][] accidentData = new int[3][2]; // 3 cities, 2 vehicle types
        
        // Prompt user for input and populate the 2D array
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidentData[i][0] = scanner.nextInt();
            
            System.out.print("Enter the number of motor bike accidents for " + cities[i] + ": ");
            accidentData[i][1] = scanner.nextInt();
        }
        
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("------------------------------------------------------------------------");
        
        // Print header using tabs
        System.out.println("\t\t\tCAR\t\tMOTOR BIKE");
        
        // Display the accident data using tabs
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + accidentData[i][0] + "\t\t" + accidentData[i][1]);
        }
        
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------------");
        
        // Calculate and display totals for each city
        int[] cityTotals = new int[3];
        int maxAccidents = 0;
        String cityWithMostAccidents = "";
        
        for (int i = 0; i < cities.length; i++) {
            cityTotals[i] = accidentData[i][0] + accidentData[i][1];
            System.out.println(cities[i] + "\t" + cityTotals[i]);
            
            // Find city with most accidents
            if (cityTotals[i] > maxAccidents) {
                maxAccidents = cityTotals[i];
                cityWithMostAccidents = cities[i];
            }
        }
        
        // Display city with most accidents
        System.out.println("\nCITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMostAccidents);
        System.out.println("------------------------------------------------------------------------");
        
        scanner.close();
    }
}
