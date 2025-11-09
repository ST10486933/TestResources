
package com.mycompany.estateapp;

// Interface
public interface IEstateAgent {
    double CalculateCommission(String propertyPrice, String agentCommission);
    boolean ValidateData(Data dataToValidate);
}
