package com.factory.factory;

import com.factory.vehicle.Truck;
import com.factory.vehicle.Vehicle;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}
