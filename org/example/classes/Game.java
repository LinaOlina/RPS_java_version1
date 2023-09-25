package org.example.classes;

import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;

import java.util.Scanner;

import static org.example.classes.ComputerTool.getCurrentState;

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

    public static void gameLoop(@org.jetbrains.annotations.NotNull Player player)  {
        int round = 0;        // round kan inte vara 0 här för då kommer den att vara 0 hela tiden.
        round++;
        System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Exit the game");
        playerChoice = scanner.nextInt();
        evaluateRound(playerChoice);
    }

    public static void evaluateRound(int playerChoice) {
        switch (playerChoice) {
            case 1:
                //playerChoosedRock();
                ToolState computerChoice = getCurrentState();
                String choiceString = computerChoice.toString().toLowerCase();
                System.out.println("TEST");
                System.out.println(choiceString);
                System.out.println(getCurrentState());

                computer.getComputerChoice();
                System.out.println(computerChoice);

                break;
            case 2:
                playerChoosedPaper();
                break;
            case 3:
                playerChoosedScissors();
                break;
            case 4:
                System.exit(0);
        }
    }

    /*
    public static void fetchComputerTool(int playerChoice) {
        computer.setComputerChoice();
        computer.getComputerChoice();
    }

     */

    public static void playerChoosedRock() {
        ToolState computerChoice = getCurrentState();
        String choiceString = computerChoice.toString().toLowerCase();
        System.out.println("TEST");
        System.out.println(choiceString);
        System.out.println(getCurrentState());

        computer.getComputerChoice();
        System.out.println(computerChoice);
/*
        if (choiceString.contains("rock")) {
            isComputerRock = true;
        } else isComputerRock = false;

        if(computerChoice.equals(getCurrentState())) {
            System.out.println("It's a draw!");
        } else if (computerChoice.equals(getCurrentState())) {
            System.out.println("You lost ");
        }
            else if (computerChoice.equals(getCurrentState())) {
            System.out.println("You won!");


 */

    }

    public static void playerChoosedPaper() {
        ToolState computerChoice = computer.setComputerChoice();
        computer.getComputerChoice();
        System.out.println(computerChoice);

        if(computerChoice.equals(getCurrentState())) {
            System.out.println("You won!");
        } else if (computerChoice.equals(getCurrentState())) {
            System.out.println("It's a draw!");
        }
        else if (computerChoice.equals(getCurrentState())) {
            System.out.println("You lost!");
        }
    }

    public static void playerChoosedScissors() {
        ToolState computerChoice = computer.setComputerChoice();
        computer.getComputerChoice();
        System.out.println(computerChoice);

        if(computerChoice.equals(getCurrentState())) {
            System.out.println("You lost!");
        } else if (computerChoice.equals(getCurrentState())) {
            System.out.println("You won! ");
        }
        else if (computerChoice.equals(getCurrentState())) {
            System.out.println("It's a draw!");
        }
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
