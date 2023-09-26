package org.example.classes;

import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

import static org.example.classes.ComputerTool.getCurrentState;

public class Game {
    private int endScore;
    private int maxScore = 11;
    private static int playerChoice = 0;

    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer(1, 0);
    static int round = 0;        // round kan inte vara 0 här för då kommer den att vara 0 hela tiden.


    public Game(int endScore, int maxScore) {
        this.endScore = endScore;
        this.maxScore = maxScore;
    }

    public static void gameLoop(@NotNull Player player)  {
        System.out.println(player.getName());

        round++;
        System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Exit the game");
        playerChoice = scanner.nextInt();
        evaluateRound(playerChoice, player);
    }

    public static void evaluateRound(int playerChoice, Player player) {
        switch (playerChoice) {
            case 1:
                playerChoosedRock(player);

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


    public static void playerChoosedRock(Player player) {
        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println(computerChoice);

        if(computerChoice instanceof RockState) {
            System.out.println("It's a draw!");
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("Computer won!");
        } else if(computerChoice instanceof ScissorsState) {
            System.out.println("You won!");
        }

        gameLoop(player);

    }

    public static void playerChoosedPaper() {

        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println(computerChoice);

        if(computerChoice instanceof RockState) {
            System.out.println("You won!");
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("It's a draw!");
        } else if(computerChoice instanceof ScissorsState) {
            System.out.println("You lost!");
        }



    }

    public static void playerChoosedScissors() {

        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println(computerChoice);

        if(computerChoice instanceof RockState) {
            System.out.println("You lost!");
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("You win!");
        } else if(computerChoice instanceof ScissorsState) {
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
