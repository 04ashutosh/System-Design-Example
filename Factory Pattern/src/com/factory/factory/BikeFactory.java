package com.factory.factory;

import com.factory.vehicle.Bike;
import com.factory.vehicle.Vehicle;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Bike();
    }
}
