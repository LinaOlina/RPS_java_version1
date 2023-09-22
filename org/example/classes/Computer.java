package org.example.classes;

public class Computer {

    private int computerChoice;
    private int computerScore;

    public Computer(int computerChoice, int computerScore) {
        this.computerChoice = computerChoice;
        this.computerScore = computerScore;
    }

    public int getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }
}
