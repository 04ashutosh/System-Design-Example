package com.factory.vehicle;

import java.util.logging.Logger;

public class Car implements  Vehicle {
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    public Car(){
        logger.info("[LOG] Car object created.");
    }

    @Override
    public void drive(){
        System.out.println("Car is driving on the highway!");
    }
}
