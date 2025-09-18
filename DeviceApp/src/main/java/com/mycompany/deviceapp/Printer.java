
package com.mycompany.deviceapp;

// Implement Printer Class
public class Printer implements iDevice{
    
    private String deviceName;
    private String location;
    private int pagesPrinted;
    
    public Printer(String deviceName, String location, int pagesPrinted)
    {
        this.deviceName = deviceName;
        this.location = location;
        this.pagesPrinted = pagesPrinted;
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
        if (pagesPrinted > 10000)
        {
            return true;
        }
        return false;
    }
}
