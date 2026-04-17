package com.observer;

import java.util.*;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            //Demonstrating both:
            //1. Push: Passing temperature and humidity
            //2. Pull: Passing 'this' so observer can pull 'pressure' if it wants
            observer.update(temperature,humidity,this);
        }
    }

    //This method simulates a sensor update
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("\n[WeatherStation] Measurements Updated: " + temperature + "°C, " + humidity + "% humidity.");
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }
}