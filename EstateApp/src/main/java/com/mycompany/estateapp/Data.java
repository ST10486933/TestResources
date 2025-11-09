
package com.mycompany.estateapp;

// Constructor class
public class Data {
    
    private String agentLocation;
    private String agentName;
    private double propertyPrice;
    private double agentCommission;

    // Constructor
    public Data(String agentLocation, String agentName, double propertyPrice, double agentCommission) 
    {
        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.agentCommission = agentCommission;
    }
    
    // Getters
    public String getAgentLocation() {
        return agentLocation;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return agentCommission;
    }

    
    
    
}
