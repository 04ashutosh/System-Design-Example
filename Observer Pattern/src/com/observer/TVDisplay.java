package com.observer;

public class TVDisplay  implements Observer {
    @Override
    public void update(float temperature, float humidity, Subject subject) {
        float pressure = 0;
        if (subject instanceof WeatherStation){
            pressure = ((WeatherStation) subject).getPressure();
        }

        System.out.println("[TV Display] Weather Alert: "+temperature+"°C, "+humidity+"% humidity" +
                "Barometric Pressure: "+pressure+" hPa");
    }
}