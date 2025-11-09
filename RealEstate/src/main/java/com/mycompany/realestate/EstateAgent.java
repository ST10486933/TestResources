
package com.mycompany.realestate;

public class EstateAgent implements IEstateAgent{
    
    @Override
    public double EstateAgentSales(double[] propertySales)
    {
        double totalCost = 0;
        for (double cost: propertySales)
        {
            totalCost += cost;
        }
        return totalCost;
    }
    
    @Override
    public double EstateAgentCommission(double propertySales)
    {
        double pay = 0.02 * propertySales;
        return pay;
    }
    
    @Override
    public int TopEstateAgent(double[] totalSales)
    {
        int topIndex = 0;
        
        for (int i = 0; i < totalSales.length; i++)
        {
            if (totalSales[i] > totalSales[topIndex])
            {
                topIndex = i;
            }
        }
        return topIndex;
    }
}
