
package com.mycompany.vehicleregistration;


public class Vehicle {
    
    // Code Attribution
    // *******************************************
    // Title: DemoHorses- Information hiding & Inheritance
    // Author: Denzyl S Govender
    // Date: 2025
    // Code Version: 1.0
    // Availability: https://github.com/DenzylSGovender/PROG6112_Mock_Test_Resources/blob/main/DemoHorses-%20Information%20hiding%20%26%20Inheritance/src/demohorses/Horse.java
    
    private String regNumber;
    private int year;
    private FuelType fuel;

    public Vehicle(String regNumber, int year, FuelType fuel) {
        this.regNumber = regNumber;
        this.year = year;
        this.fuel = fuel;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }
    
    @Override
    public String toString(){
        return "Reg: " + regNumber + " | Year: " + year + " | Fuel: " + fuel; 
    }
}
