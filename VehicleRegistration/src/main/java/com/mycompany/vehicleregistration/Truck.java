
package com.mycompany.vehicleregistration;


public class Truck extends Vehicle{
    
    private int loadCapacity;

    public Truck(String regNumber, int year, FuelType fuel, int loadCapacity) {
        super(regNumber, year, fuel);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public String toString(){
        return "Truck | " + super.toString() + " | Capacity: " + loadCapacity + " tons";
    }
}
