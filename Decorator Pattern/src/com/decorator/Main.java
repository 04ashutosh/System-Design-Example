package com.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("         Decorator Pattern Demo           ");
        System.out.println("==========================================");

        // 1. Just a plain coffee
        System.out.println("\n>>> Order 1: Plain Coffee");
        Coffee plainCoffee = new BasicCoffee();
        printCoffeeDetails(plainCoffee);

        // 2. Coffee with Milk and Sugar
        System.out.println("\n>>> Order 2: Coffee + Milk + Sugar");
        Coffee milkSugarCoffee = new BasicCoffee();
        milkSugarCoffee = new MilkDecorator(milkSugarCoffee); //Wrap with Milk
        milkSugarCoffee = new SugarDecorator(milkSugarCoffee); //Wrap with Sugar
        printCoffeeDetails(milkSugarCoffee);

        //3. Fully loaded coffee with everything (Double Sugar)
        System.out.println("\n>>> Order 3: The Works (Milk, Whip, Double Sugar)");

        Coffee loadedCoffee = new WhipDecorator(
                new SugarDecorator(
                        new SugarDecorator(
                                new MilkDecorator(
                                        new BasicCoffee()
                                )
                        )
                )
        );

        printCoffeeDetails(loadedCoffee);
    }

    //Helper method to format output
    private static void printCoffeeDetails(Coffee coffee){
        System.out.println("Description: "+coffee.getDescription());
        System.out.printf("Cost      :$%.2f%n", coffee.getCost());
    }
}