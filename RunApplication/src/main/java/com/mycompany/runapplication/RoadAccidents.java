
package com.mycompany.runapplication;

// Abstract Class
// This class implements interface class
public abstract class RoadAccidents implements IRoadAccidents{
    
    private String vehicleType;
    private String city;
    private int numAccidents;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int numAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numAccidents = numAccidents;
    }

    // Getters
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }
    
    public int getAccidentTotal() {
        return numAccidents;
    }
}
