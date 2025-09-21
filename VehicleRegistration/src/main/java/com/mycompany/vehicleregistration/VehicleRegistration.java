
package com.mycompany.vehicleregistration;

public class VehicleRegistration {

    public static void main(String[] args) {
        System.out.println("=== Vehicle Registry ===");
        
        Vehicle[] vehicles = new Vehicle[]
        {
            new Car("ND123-2020", 2020, FuelType.PETROL, 5),
            new Truck("ND555-2018", 2018, FuelType.DIESEL, 8),
            new Car("ND999-2021", 2021, FuelType.ELECTRIC, 4),
            new Truck("ND777-2015", 2015, FuelType.ELECTRIC, 12)
        };
        
        for (Vehicle v: vehicles)
        {
            System.out.println(v);
        }
        
        Vehicle old = vehicles[0];
        for (Vehicle v: vehicles){
            if (v.getYear() < old.getYear())
            {
                old = v;
            }
        }
        System.out.println("\nOldest vehicle: " + old.getClass().getSimpleName() + " (" + old.getRegNumber() + ", " + old.getYear() + ")");
        
        int electricVehicle = 0;
        for (Vehicle v: vehicles){
            if (v.getFuel() == FuelType.ELECTRIC)
            {
                electricVehicle ++;
            }
        }
        System.out.println("Electric Vehicles: " + electricVehicle);
    }
}
