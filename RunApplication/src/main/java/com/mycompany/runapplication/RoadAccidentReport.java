
package com.mycompany.runapplication;

// Subclass extending Abstract class
public class RoadAccidentReport extends RoadAccidents{

    // Constructor
    public RoadAccidentReport(String vehicleType, String city, int numAccidents) {
        super(vehicleType, city, numAccidents);
    }
    
    // Method to Print Report
    public void printAccidentReport()
    {
        System.out.println("\nVEHICLE ACCIDENT REPORT"
                + "\n************************"
                + "\nVEHICLE TYPE: " + getAccidentVehicleType() 
                + "\nCITY: " + getCity() 
                + "\nACCIDENT TOTAL: " + getAccidentTotal()
                + "\n************************");
    }
}
