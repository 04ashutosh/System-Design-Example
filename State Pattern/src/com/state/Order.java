package com.state;

public class Order {
    private State currentState;

    public Order(){
        this.currentState = new IdleState();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public State getState(){
        return currentState;
    }

    public void proceed(){
        currentState.handle(this);
    }
}