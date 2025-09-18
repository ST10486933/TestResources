
package com.mycompany.deviceapp;


public class Projector implements iDevice {
    
     private String deviceName;
    private String location;
    private int hoursUsed;
    
    public Projector (String deviceName, String location, int hoursUsed)
    {
        this.deviceName = deviceName;
        this.location = location;
        this.hoursUsed = hoursUsed;
    }
    
    // Fill methods from iDevice
    public String getDeviceName()
    {
        return this.deviceName;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    // Printer requires service if more than 10000 pages printed
    public boolean needsService()
    {
        if (hoursUsed > 500)
        {
            return true;
        }
        return false;
    }
}


