package com.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starting Singleton Pattern Demo ===\n");

        //1. Testing Thread-Safe Singleton
        System.out.println(">>> 1. Test Thread-Safe (Double-Checked Locking):");
        Runnable task = () -> {
            DatabaseConnection db = DatabaseConnection.getInstance();
            db.connect();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (java.lang.Exception e) {}

        System.out.println("\n>>> 2. Testing Enum Singleton:");
        EnumSingleton.INSTANCE.connect();

        System.out.println("\n>>> 3. Testing Unsafe Singleton:");
        Runnable unsafeTask = () -> {
            UnsafeDatabaseConnection.getInstance();
        };

        for (int i=0;i<5;i++){
            new Thread(unsafeTask).start();
        }
    }
}