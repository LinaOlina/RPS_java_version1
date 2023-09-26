package org.example.States;

import org.example.classes.ComputerTool;

public class RockState implements ToolState {

    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Rock");
    }
    @Override
    public void updateState(ComputerTool computerTool) {
        computerTool.setCurrentState(new RockState());
    }

    @Override
    public String toString() {
        return "RockState";
    }
}
