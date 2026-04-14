package com.factory.factory;

import com.factory.vehicle.Car;
import com.factory.vehicle.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
