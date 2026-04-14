package com.factory;

import com.factory.factory.BikeFactory;
import com.factory.factory.CarFactory;
import com.factory.factory.TruckFactory;
import com.factory.factory.VehicleFactory;
import com.factory.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   Factory Method Pattern - Demo          ");
        System.out.println("==========================================\n");

        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory truckFactory = new TruckFactory();

        System.out.println(">>> Creating Car via CarFactory:");
        Vehicle car = carFactory.createVehicle();
        car.drive();

        System.out.println("\n>>> Creating Bike via BikeFactory:");
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();

        System.out.println("\n>>> Creating Truck via TruckFactory:");
        Vehicle truck = truckFactory.createVehicle();
        truck.drive();

        System.out.println("\n>>> Using deliverVehicle() template method:");
        carFactory.deliverVehicle();
        bikeFactory.deliverVehicle();
        truckFactory.deliverVehicle();

        System.out.println("\n==========================================");
        System.out.println("   All factories tested successfully!     ");
        System.out.println("==========================================");
    }
}
