
package com.mycompany.maintechnician;

public class Data 
{
    public String Technician_Location;
    public String Technician_Name;
    public double Repair_Cost;
    public double Technician_Rate;
    
    // Constructor
    public Data (String location, String name, double cost, double rate)
    {
        this.Technician_Location = location;
        this.Technician_Name = name;
        this.Repair_Cost = cost;
        this.Technician_Rate = rate;
    }
}
