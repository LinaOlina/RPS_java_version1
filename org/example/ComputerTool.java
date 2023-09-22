package org.example;

public class ComputerTool {

    private ToolState currentState;

    public ComputerTool() {
        currentState = new RockState();
    }

    public void displayTool() {
        currentState.displayTool();
    }

    public void changeTool() {
        currentState.updateState(this);
    }

    public void setCurrentState(ToolState state) {
        currentState = state;
    }
}
