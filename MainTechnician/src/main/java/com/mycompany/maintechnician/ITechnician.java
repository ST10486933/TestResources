
package com.mycompany.maintechnician;

// Interface
public interface ITechnician {
    double CalculatePay(String repairCost, String rate);
    boolean ValidateData(Data datatoValidate);
}
