package org.example;

public class PaperState implements ToolState {

    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Paper");
    }

    @Override
    public void updateState(ComputerTool computerTool) {
        computerTool.setCurrentState(new PaperState());
    }
}
