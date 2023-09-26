package org.example.classes;

import org.example.States.ToolState;

public class Computer {

    private int computerScore;

    private static ComputerTool computerTool = new ComputerTool();


    public Computer(int computerScore) {
        this.computerScore = computerScore;
    }

    public ToolState getComputerChoice() {
        computerTool.displayTool();
        return ComputerTool.getCurrentState();
    }

    public void setComputerChoice() {
         computerTool.changeTool();
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }
}
