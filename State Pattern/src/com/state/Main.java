package com.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("           State Pattern Demo              ");
        System.out.println("==========================================");

        Order myOrder = new Order();

        System.out.println("\nInitial local State: "+myOrder.getState());

        //Call proceed multiple times. Notice how the behavior changes!
        System.out.println("\n>>> Triggering Step 1:");
        myOrder.proceed();

        System.out.println("\n>>> Triggering Step 2:");
        myOrder.proceed();

        System.out.println("\n>>> Triggering Step 3:");
        myOrder.proceed();

        System.out.println("\nFinal State: "+myOrder.getState());

        System.out.println("\n==========================================");
        System.out.println("   State transitions completed!           ");
        System.out.println("==========================================");
    }
}