package org.example.classes;

import org.example.States.RockState;
import org.example.States.ToolState;

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
