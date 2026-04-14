package com.factory.vehicle;

import java.util.logging.Logger;

public class Bike implements Vehicle {
    private static final Logger logger = Logger.getLogger(Bike.class.getName());

    public Bike(){
        logger.info("[LOG] Bike object created.");
    }

    @Override
    public void drive(){
        System.out.println("Bike is speeding through the lane!");
    }
}
