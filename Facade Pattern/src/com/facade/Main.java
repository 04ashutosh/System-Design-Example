package com.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("          Facade Pattern Demo             ");
        System.out.println("==========================================");
        System.out.println("\n[Client] User presses the power button on the computer case...");

        // The client creates the Facade exactly once.
        ComputerFacade myComputer = new ComputerFacade();

        // The client triggers a massive sequence of events with just ONE command.
        // They know nothing about CPU, RAM, or Hard Drives.
        myComputer.startComputer();

        System.out.println("==========================================");
        System.out.println("   Computer is now on and ready to use!   ");
        System.out.println("==========================================");
    }
}