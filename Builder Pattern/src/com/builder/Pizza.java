package com.builder;

import java.util.*;

public class Pizza {
    private final String size;   // REQUIRED
    private final String crust;  // REQUIRED

    // Optional fields
    private final boolean cheese;
    private final List<String> toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(builder.toppings));
    }

    // Getters
    public String getSize()           { return size; }
    public String getCrust()          { return crust; }
    public boolean hasCheese()        { return cheese; }
    public List<String> getToppings() { return toppings; }

    @Override
    public String toString() {
        return "\n----- Pizza Order -----"
                + "\n  Size     : " + size
                + "\n  Crust    : " + crust
                + "\n  Cheese   : " + (cheese ? "Yes" : "No")
                + "\n  Toppings : " + (toppings.isEmpty() ? "None" : String.join(", ", toppings))
                + "\n-----------------------";
    }

    // Static Builder class — direct member of Pizza
    public static class Builder {
        private final String size;
        private final String crust;

        private boolean cheese = false;
        private List<String> toppings = new ArrayList<>();

        public Builder(String size, String crust) {
            if (size == null || size.isBlank()) {
                throw new IllegalArgumentException("[ERROR] Size is required!");
            }
            if (crust == null || crust.isBlank()) {
                throw new IllegalArgumentException("[ERROR] Crust is required!");
            }
            this.size = size;
            this.crust = crust;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        // Takes a single String topping — supports method chaining
        public Builder topping(String topping) {
            if (topping != null && !topping.isBlank()) {
                this.toppings.add(topping);
            }
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}