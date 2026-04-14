package com.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void connect(){
        System.out.println("[ENUM] Connected using: "+this.hashCode());
    }
}