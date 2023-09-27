package org.example.classes;

import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Game {

    public static int maxRounds = 11;
    private static int playerChoice = 0;

    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer( 0);
    static int round = 0;



    public Game(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public static void gameLoop(@NotNull Player player)  {

        if (round == player.getRounds()){
            printWinner(player);

        } else {
            round++;
            System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Exit the game");
            playerChoice = scanner.nextInt();
            evaluateRound(playerChoice, player);
        }
    }

    public static void evaluateRound(int playerChoice, Player player) {
        switch (playerChoice) {
            case 1:
                playerChoosedRock(player);
                break;
            case 2:
                playerChoosedPaper(player);
                break;
            case 3:
                playerChoosedScissors(player);
                break;
            case 4:
                System.exit(0);
        }
    }


    public static void playerChoosedRock(Player player) {

        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println("You have chosen Rock");

        if(computerChoice instanceof RockState) {
            System.out.println("It's a draw!");
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("You lost!");
            computer.setComputerScore(computer.getComputerScore() + 1);
        }
        else if(computerChoice instanceof ScissorsState) {
            System.out.println("You won!");
            player.setUserScore(player.getUserScore() + 1);
        }
        printScore(player);
        gameLoop(player);
    }

    public static void playerChoosedPaper(Player player) {

        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println("You have chosen Paper");

        if(computerChoice instanceof RockState) {
            System.out.println("You won!");
            player.setUserScore(player.getUserScore() + 1);
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("It's a draw!");
        }
        else if(computerChoice instanceof ScissorsState) {
            System.out.println("You lost!");
            computer.setComputerScore(computer.getComputerScore() + 1);
        }
        printScore(player);
        gameLoop(player);
    }

    public static void playerChoosedScissors(Player player) {

        computer.setComputerChoice();
        ToolState computerChoice = computer.getComputerChoice();
        System.out.println("You have chosen Scissors");

        if(computerChoice instanceof RockState) {
            System.out.println("You lost!");
            computer.setComputerScore(computer.getComputerScore() + 1);
        }
        else if(computerChoice instanceof PaperState) {
            System.out.println("You win!");
            player.setUserScore(player.getUserScore() + 1);
        }
        else if(computerChoice instanceof ScissorsState) {
            System.out.println("It's a draw!");
        }
        printScore(player);
        gameLoop(player);
    }

    public int getMaxScore() {
        return maxRounds;
    }

    public void setMaxScore(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public static void printScore(Player player){
        System.out.println(player.getName() + " has " + player.getUserScore() + " points | Computer has " + computer.getComputerScore() + " points");
        System.out.println();
        System.out.println("__________________________________________________________");
        System.out.println();
    }

    public static void printWinner(Player player){

        if (player.getUserScore() == computer.getComputerScore()){
            System.out.println("It's a tie, you get one more chance to win!");
            System.out.println(player.getName() + " has " + player.getUserScore() + " points | Computer has " + computer.getComputerScore()+ " points");
            player.setRounds(player.getRounds() + 1);
            gameLoop(player);
        } else if (player.getUserScore() > computer.getComputerScore()) {
            player.setUserScore(player.getUserScore() + 1);
            System.out.println("You win!!");
            System.out.println("Game over.");
        }
        else {
            computer.setComputerScore(computer.getComputerScore() + 1);
            System.out.println("You lost, try again!");
            System.out.println("Game over, you lost");
        }
    }
}
