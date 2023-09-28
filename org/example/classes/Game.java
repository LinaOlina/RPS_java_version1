package org.example.classes;

import org.example.MainMenu;
import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.example.Main.isNewGame;
import static org.example.MainMenu.runMenu;

public class Game {

    public static int maxRounds = 11;
    private static int playerChoice = 0;

    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer( 0);
    public static List<GameHistory> gameHistoryList = new ArrayList<>();

    static int round = 0;

    public Game(int maxRounds, Scanner scanner,  Computer computer, List<GameHistory> gameHistoryList) {
        this.maxRounds = maxRounds;
        this.scanner = scanner;
        this.computer = computer;
        this.gameHistoryList = gameHistoryList;
    }

    public static void gameLoop(@NotNull Player player, boolean isNewGame)  {


        if (round == player.getRounds()){
            printWinner(player, isNewGame);

        } else {
            round++;
            System.out.println("Round " + round + " of " + player.getRounds() + "\n Choose your tool : \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Exit the game");
            playerChoice = scanner.nextInt();
            evaluateRound(playerChoice, player, isNewGame);
        }
    }

    public static void evaluateRound(int playerChoice, Player player, boolean isNewGame) {
        switch (playerChoice) {
            case 1:
                playerChoosedRock(player, isNewGame);
                break;
            case 2:
                playerChoosedPaper(player, isNewGame);
                break;
            case 3:
                playerChoosedScissors(player, isNewGame);
                break;
            case 4:
                System.exit(0);
        }
    }


    public static void playerChoosedRock(Player player, boolean isNewGame) {

        computer.setComputerChoice(player);
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
        GameHistory gameHistory = new GameHistory(round, player.getName(), computerChoice, "Rock", player.getUserScore(), computer.getComputerScore());
        gameHistoryList.add(gameHistory);
        gameLoop(player, isNewGame);
    }

    public static void playerChoosedPaper(Player player, boolean isNewGame) {

        computer.setComputerChoice(player);
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
        GameHistory gameHistory = new GameHistory(round, player.getName(), computerChoice, "Paper", player.getUserScore(), computer.getComputerScore());
        gameHistoryList.add(gameHistory);
        gameLoop(player, isNewGame);
    }

    public static void playerChoosedScissors(Player player, boolean isNewGame) {

        computer.setComputerChoice(player);
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
        GameHistory gameHistory = new GameHistory(round, player.getName(), computerChoice, "Scissors", player.getUserScore(), computer.getComputerScore());
        gameHistoryList.add(gameHistory);
        gameLoop(player, isNewGame);
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

    public static void printWinner(Player player, boolean isNewGame){

        if (player.getUserScore() == computer.getComputerScore()){
            System.out.println("It's a tie, you get one more chance to win!");
            System.out.println(player.getName() + " has " + player.getUserScore() + " points | Computer has " + computer.getComputerScore()+ " points");
            player.setRounds(player.getRounds() + 1);
            gameLoop(player, isNewGame);
        } else if (player.getUserScore() > computer.getComputerScore()) {
            player.setUserScore(player.getUserScore() + 1);
            System.out.println("You win!!");
            System.out.println("Game over.");
            System.out.println();
        }
        else {
            computer.setComputerScore(computer.getComputerScore() + 1);
        }
        GameHistory.printGameHistory();
        MainMenu.playAgain(isNewGame, player);
    }
}
