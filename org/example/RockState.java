package org.example;

public class RockState implements ToolState {
    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Rock");
    }
    @Override
    public void updateState(ComputerTool computerTool) {
        computerTool.setCurrentState(new RockState());
    }
}
