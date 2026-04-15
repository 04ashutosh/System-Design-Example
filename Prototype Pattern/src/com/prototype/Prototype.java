package com.prototype;

public interface Prototype {
    Prototype clone();

    Prototype deepClone();
}