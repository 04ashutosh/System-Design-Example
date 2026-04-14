package com.singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("[DB] New Database Connection instance initialized.");
    }

    public static DatabaseConnection getInstance() {
        if (instance==null){
            synchronized (DatabaseConnection.class){
                if (instance==null){
                    instance = new DatabaseConnection();
                }
            }
        }

        return instance;
    }

    public void connect(){
        System.out.println("[DB] Connected to database using Instance: "+ this.hashCode());
    }
}