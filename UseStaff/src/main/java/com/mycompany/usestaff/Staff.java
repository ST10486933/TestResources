
package com.mycompany.usestaff;

public abstract class Staff implements iStaff {
    
    private int staffNumber;
    private String location;

    public Staff(int staffNumber, String location) {
        this.staffNumber = staffNumber;
        this.location = location;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public String getStaffLocation() {
        return location;
    }
    
    public abstract String getStaffHiringProcess();
}
