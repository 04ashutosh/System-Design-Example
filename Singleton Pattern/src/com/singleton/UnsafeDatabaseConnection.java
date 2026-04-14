package com.singleton;

public class UnsafeDatabaseConnection {
    private static UnsafeDatabaseConnection instance;

    private UnsafeDatabaseConnection(){
        System.out.println("[UNSAFE] Creating an instance...");
    }

    public static UnsafeDatabaseConnection getInstance(){
        if (instance == null){
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){}
            instance = new UnsafeDatabaseConnection();
        }
        return instance;
    }
}