package org.example.classes;

import org.example.States.ToolState;

public class Computer {

    private int computerChoice;
    private int computerScore;

    private ComputerTool computerTool = new ComputerTool();


    public Computer(int computerChoice, int computerScore) {
        this.computerChoice = computerChoice;
        this.computerScore = computerScore;
    }

    public void getComputerChoice() {
         computerTool.displayTool();

    }

    /*
    public void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

     */
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
