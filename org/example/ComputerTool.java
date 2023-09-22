package org.example;

public class ComputerTool {

    private ComputerToolState currentState;

    public ComputerTool() {
        currentState = new RockState();
    }

    public void displayTool() {
        currentState.displayTool();
    }

    public void setCurrentState(ComputerToolState state) {
        currentState = state;
    }
}
