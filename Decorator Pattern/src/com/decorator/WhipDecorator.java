package com.decorator;

public class WhipDecorator extends CoffeeDecorator{
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost(){
        return super.getCost() + 0.75; //Adds 75 cents
    }

    @Override
    public String getDescription(){
        return super.getDescription()+", Whip Cream";
    }
}