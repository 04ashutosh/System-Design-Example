package com.prototype;

import java.util.*;

public  class PrototypeRegistry{
    private Map<String,Prototype> registry = new HashMap<>();

    public void addPrototype(String key,Prototype prototype){
        registry.put(key,prototype);
    }

    public Prototype getPrototype(String key){
        Prototype p = registry.get(key);
        return (p!=null) ? p.clone():null;
    }

    public Prototype getDeepPrototype(String key){
        Prototype p = registry.get(key);
        return (p!=null)?p.deepClone():null;
    }
}