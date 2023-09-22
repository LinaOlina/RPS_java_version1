package org.example.classes;

import java.util.Scanner;

public class Game {
    private int endScore;
    private int maxScore = 11;
    private static int playerChoice = 0;

    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer(1, 0);


    public Game(int endScore, int maxScore) {
        this.endScore = endScore;
        this.maxScore = maxScore;
    }

    public static void gameLoop(Player player)  {
        int round = 1;
        round++;
        System.out.println("Round " + round + " of " + player.getRounds() + ". For Rock, press 1. For Paper, press 2. For Scissors, press 3!");
        playerChoice = scanner.nextInt();
        computer.setComputerChoice();
        computer.getComputerChoice();

    }
    public int getEndScore() {
        return endScore;
    }

    public void setEndScore(int endScore) {
        this.endScore = endScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
}
