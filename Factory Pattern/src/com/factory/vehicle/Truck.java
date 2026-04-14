package com.factory.vehicle;

import java.util.logging.Logger;

public class Truck implements Vehicle {
    private static final Logger logger = Logger.getLogger(Truck.class.getName());

    public Truck(){
        logger.info("[LOG] Truck object created.");
    }

    @Override
    public void drive(){
        System.out.println("Truck is hauling cargo on the freeway!");
    }
}
