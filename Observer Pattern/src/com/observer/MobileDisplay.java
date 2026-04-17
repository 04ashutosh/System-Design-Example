package com.observer;

public class MobileDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, Subject subject) {
        // Mobile only cares about basic stats pushed from the station
        System.out.println("[Mobile Display] Current Temp: " + temperature + "°C | Humidity: " + humidity + "%");
    }
}