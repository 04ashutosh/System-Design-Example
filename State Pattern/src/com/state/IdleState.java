package com.state;

public class IdleState  implements State {
    @Override
    public void handle(Order order){
        System.out.println("[Idle State] Order received. Initializing processing...");
        // Transition to the next state
        order.setState(new ProcessingState());
    }

    @Override
    public String toString() {
        return "IdleState";
    }
}