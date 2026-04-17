package com.state;

public interface State {
    void handle(Order order);
}