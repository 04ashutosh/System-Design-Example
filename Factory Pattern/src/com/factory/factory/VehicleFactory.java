package com.factory.factory;

import com.factory.vehicle.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void deliverVehicle(){
        Vehicle vehicle = createVehicle();
        System.out.println("------------------------------------------");
        System.out.println("Vehicle ready for delivery. Testing drive:");
        vehicle.drive();
        System.out.println("------------------------------------------");
    }
}
