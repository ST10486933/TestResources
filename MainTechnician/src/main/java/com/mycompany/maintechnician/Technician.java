
package com.mycompany.maintechnician;

public class Technician implements ITechnician
{
    // Calculate technician pay
    @Override
    public double CalculatePay(String repairCost, String rate)
    {
        double cost = Double.parseDouble(repairCost);
        
        // rate needs to be a percentage
        double r = Double.parseDouble(rate)/100;
        double pay = cost * r;
        
        return pay;
    }
    
    // Validate input data before processing
    @Override
    public boolean ValidateData(Data d) 
    {  
        if(d.Technician_Location.isEmpty())
        {
            return false;
        }
        if(d.Technician_Name.isEmpty())
        {
            return false;
        }
        if(d.Repair_Cost <=0)
        {
            return false;
        }
        if(d.Technician_Rate <=0)
        {
            return false;
        }
        
        return true;
    } 
}
