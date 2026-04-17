package com.observer;

public interface Observer {
    // We pass the data directly (Push Model)
    // and/or pass the Subject reference (Pull Model)
    void update(float temperature, float humidity, Subject subject);
}