
package com.mycompany.rideapp;

// Main Class
public class RideApp {

    public static void main(String[] args) {
        
        Ride [] rides = new Ride[2];
        
        rides[0] = new CarRide ("Alice", 3, 30 );
        rides[1] = new BikeRIde ("Bob", 50);
        
        // Print report
        System.out.println("=== Campus Ride Sharing Report ===");
        for (Ride r: rides)
        {
            System.out.println("Driver: " + r.getDriverName() + " | Passengers: " + r.getPassengerCount() + " | Fare: R" + r.calculateFare());
        }
    }
}
