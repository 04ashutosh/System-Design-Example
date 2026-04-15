package com.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     Builder Pattern - Pizza Demo         ");
        System.out.println("==========================================");

        Pizza plainPizza = new Pizza.Builder("Small","Thin")
                .build();
        System.out.println("\n>>> Plain Pizza:");
        System.out.println(plainPizza);

        Pizza cheesePizza = new Pizza.Builder("Medium","Stuffed")
                .cheese(true)
                .topping("Olives")
                .topping("Mushrooms")
                .build();
        System.out.println("\n>>> Cheese Pizza:");
        System.out.println(cheesePizza);

        Pizza loadedPizza = new Pizza.Builder("Large", "Thick")
                .cheese(true)
                .topping("Pepperoni")
                .topping("Jalapeños")
                .topping("Onions")
                .topping("Bell Peppers")
                .build();
        System.out.println("\n>>> Fully Loaded Pizza:");
        System.out.println(loadedPizza);

        System.out.println("\n>>> Validation Demo (missing required field):");
        try{
            Pizza invalidPizza = new Pizza.Builder("","Thin").build();
        }catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
        System.out.println("\n==========================================");
        System.out.println("   All configurations built successfully! ");
        System.out.println("==========================================");
    }
}