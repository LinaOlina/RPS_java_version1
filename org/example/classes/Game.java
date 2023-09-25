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
        int round = 0;        // round kan inte vara 0 här för då kommer den att vara 0 hela tiden.
        round++;
        System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Exit the game");
        playerChoice = scanner.nextInt();

        evaluateRound(playerChoice);
        //computer.setComputerChoice();
        //computer.getComputerChoice();

    }

    public static void evaluateRound(int playerChoice) {
        switch (playerChoice) {
            case 1:
                fetchComputerTool();
                break;
            case 2:
                fetchComputerTool();
                break;
            case 3:
                fetchComputerTool();
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void fetchComputerTool() {
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
