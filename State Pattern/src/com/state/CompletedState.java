package com.state;

public class CompletedState implements  State {
    @Override
    public void handle() {
        System.out.println("[Completed State] Order shipped and tracking number sent. No further actions possible.");
        //Usually, a final state doesn't transition further
    }

    @Override
    public String toString(){
        return "Completed State";
    }
}