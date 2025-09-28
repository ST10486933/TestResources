
package com.mycompany.runapplication;

import java.util.Scanner;

// Main Class
public class RunApplication {

    // Main Method
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Method to enter vehicle Type
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();
        
        // Method to enter City where accident occured
        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();
        
        // Method to enter total of accidents in that city for that vehicle
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int numAccidents = scanner.nextInt();
        
        // Create RoadAccidentReport object with user input
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, numAccidents);
        
        // Print report
        report.printAccidentReport();
    }
}
