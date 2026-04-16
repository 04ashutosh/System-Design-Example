package com.decorator;

public class BasicCoffee implements Coffee{
    @Override
    public double getCost(){
        return 2.00; //Base price
    }

    @Override
    public String getDescription(){
        return "Basic Coffee";
    }
}