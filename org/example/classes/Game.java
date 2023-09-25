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
        int round = 0;
        round++;
        System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors\n 4. Exit the game");
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
