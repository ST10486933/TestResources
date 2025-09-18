
package com.mycompany.deviceapp;

public class DeviceApp {

    public static void main(String[] args) {
        
        iDevice [] devices = new iDevice[2];
        
        devices[0] = new Printer("Printer: HP LaserJet", "Library", 12000);
        devices[1] = new Projector("Projector: Epson X200", "Lecture Hall 3", 450);
        
        System.out.println("=== Smart Device Monitoring Report ===");
        for (iDevice d:devices)
        {
            System.out.println(d.getDeviceName() + " | Location: " + d.getLocation());
            System.out.println("Needs Service: " + (d.needsService()? "Yes" : "No"));
            System.out.println();
        }
    }
}
