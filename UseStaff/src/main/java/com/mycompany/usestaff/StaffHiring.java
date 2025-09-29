
package com.mycompany.usestaff;

public class StaffHiring extends Staff{

    public StaffHiring(int staffNumber, String location) {
        super(staffNumber, location);
    }
    
    public String getStaffHiringProcess()
    {
        if (getStaffNumber() < 20)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    
    public void printStaffHiring()
    {
        System.out.println("\nSTAFF HIRING REPORT"
        + "\n************************"
        + "\nLOCATION: " + getStaffLocation()
        + "\nSTAFF NUMBER: " + getStaffNumber()
        + "\nHIRE STAFF: " + getStaffHiringProcess());
    }
}
