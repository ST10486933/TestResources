
package com.mycompany.rideapp;

// Implement CarRide class
public class CarRide implements Ride{
    
    private String driverName;
    private int passengerCount;
    private double baseFarePerPassenger;
    
    public CarRide(String driverName, int passengerCount, double baseFarePerPassenger)
    {
        this.driverName = driverName;
        this.passengerCount = passengerCount;
        this.baseFarePerPassenger = baseFarePerPassenger;
    }
    
    // Fill in methods from Ride
    public String getDriverName()
    {
        return this.driverName;
    }
    
    public int getPassengerCount()
    {
        return this.passengerCount;
    }
    
    // Calculating passenger Fare for Car Ride
    public double calculateFare()
    {
        return this.baseFarePerPassenger * this.passengerCount;
    }
}
