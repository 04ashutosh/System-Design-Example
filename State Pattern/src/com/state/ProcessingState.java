package com.state;

public class ProcessingState  implements State {
    @Override
    public void handle(Order order){
        System.out.println("[Processing State] Verifying payment and packaging items...");
        //Transition to the final state
        order.setState(new CompletedState());
    }

    @Override
    public String toString() {
        return "Processing State";
    }
}