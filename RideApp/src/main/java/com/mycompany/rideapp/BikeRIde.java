
package com.mycompany.rideapp;

// Implement the BikeRide class
public class BikeRIde implements Ride{
    
    private String driverName;
    private int passengerCount;
    private double flatFare;
    
    public BikeRIde (String driverName, double flatFare)
    {
        this.driverName = driverName;
        this.passengerCount = passengerCount;
        this.flatFare = flatFare;
    }
 
    // Fill in methods from Ride
    public String getDriverName()
    {
        return this.driverName;
    }
    
    public int getPassengerCount()
    {
        passengerCount = 1;
        return this.passengerCount;
    }
    
    // Returning passenger Fare for Bike Ride
    public double calculateFare()
    {
        return this.flatFare;
    }
}