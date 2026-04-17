package com.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("         Observer Pattern Demo            ");
        System.out.println("==========================================");

        WeatherStation station = new WeatherStation();

        //Create Observers
        MobileDisplay mobile = new MobileDisplay();
        TVDisplay tv = new TVDisplay();

        // Attach Observers
        System.out.println(">>> Registering Mobile and TV displays...");
        station.attach(mobile);
        station.attach(tv);

        // Simulate Weather Changes
        station.setMeasurements(28.5f, 65.0f, 1013.1f);
        station.setMeasurements(30.2f, 70.0f, 1012.5f);

        //Detach one observer
        System.out.println("\n>>> Removing Mobile display...");
        station.detach(mobile);

        // Final measurement update
        station.setMeasurements(25.0f, 55.0f, 1015.0f);
        
        System.out.println("\n==========================================");
        System.out.println("   Observer notifications successful!     ");
        System.out.println("==========================================");
    }
}