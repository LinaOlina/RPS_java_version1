package org.example.States;

import org.example.classes.ComputerTool;

public class PaperState implements ToolState {

    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Paper");
    }

    @Override
    public void updateState(ComputerTool computerTool) {
        computerTool.setCurrentState(new PaperState());
    }

    @Override
    public String toString() {
        return "PaperState";
    }
}
