
package com.mycompany.vehicleregistration;


public class Car extends Vehicle{
    
    private int numSeats;

    public Car(String regNumber, int year, FuelType fuel, int numSeats) {
        super(regNumber, year, fuel);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    
    @Override
    public String toString(){
        return "Car | " + super.toString() + " | Seats: " + numSeats;
    }
    
}
