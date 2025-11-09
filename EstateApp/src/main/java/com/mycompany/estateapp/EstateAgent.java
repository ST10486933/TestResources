
package com.mycompany.estateapp;

// EstateAgent Class
public class EstateAgent implements IEstateAgent{ 
    
    // Method to Calculate commission
    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission)
    {
        double cost = Double.parseDouble(propertyPrice);
        
        double rate = Double.parseDouble(agentCommission)/100;
        double commissionPay = cost * rate;
        
        return commissionPay;
    }
    
    // Method to validate data
    @Override
    public boolean ValidateData(Data dataToValidate)
    {
        // Validation if there is no agent location
        if(dataToValidate.getAgentLocation().isEmpty())
        {
            return false;
        }
        
        // Validation if there is no agent name
        if (dataToValidate.getAgentName().isEmpty())
        {
            return false;
        }
        
        // Validation if property price is less than zero
        if (dataToValidate.getPropertyPrice() <=0)
        {
            return false;
        }
        
        // Validation if commissionRate is less than zero
        if (dataToValidate.getAgentCommission()<=0)
        {
            return false;
        }
        
        return true;
    }
}
