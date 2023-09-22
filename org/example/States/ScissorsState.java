package org.example.States;

import org.example.classes.ComputerTool;

public class ScissorsState implements ToolState {
    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Scissors");
    }
    @Override
    public void updateState(ComputerTool computerTool) {
        computerTool.setCurrentState(new ScissorsState());
    }
}
