package org.example;

import org.example.classes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.classes.Game.gameLoop;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static int rounds = 0;
    static int opponentPlayer = 0;
    static int round = 0;
    static String playerName = "";

    public static void runMenu(boolean isNewGame, StatisticsCalculations statisticsCalculator) {
        rounds = 0;

        if (isNewGame) {
            playerName = getName();
        }
        int playerRounds =  getRounds();
        int opponentPlayer = getOpponentPlayer();
        String opponent_Player = validateOpponent(opponentPlayer);

        System.out.println("\n " + playerName + " VS " + opponent_Player + "! Game starts now. \n");

        Player player = buildPlayer(playerName, playerRounds, opponentPlayer);
        Computer computer = new Computer( 0);

        gameLoop(player, isNewGame, round, opponentPlayer, computer, statisticsCalculator);
    }

    public static Player buildPlayer(String name, int rounds, int opponentPlayer) {
        return new Builder()
                .setName(name)
                .setRounds(rounds)
                .setUserScore(0)
                .setOpponentPlayer(opponentPlayer)
                .build();
    }

    public static String getName() {
        String name = "";
        boolean correctNameInput = false;
        while (!correctNameInput) {
            System.out.println("Welcome to Rock Paper Scissors! ");
            System.out.println("Please input your name");
            name = scanner.nextLine();
            try {
                if (name.matches("^[a-zA-Z]+$")) {
                    correctNameInput = true;
                } else {
                    throw new IllegalArgumentException("Name must contain only letters.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static int getRounds() {
        while (rounds <= 0 || rounds > Game.maxRounds) {
            try {
                System.out.println("Please choose how many rounds you'd like to play - maximum of " + Game.maxRounds);
                rounds = scanner.nextInt();
                scanner.nextLine();

                if (rounds <= 0 || rounds > Game.maxRounds) {
                    throw new IllegalArgumentException("Invalid number of rounds. Please choose between 1 and " + Game.maxRounds + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return rounds;
    }

    public static int getOpponentPlayer() {
        while (opponentPlayer < 1 || opponentPlayer > 3) {
            try {
                System.out.println("Please enter the opponent you'd like to meet during this game. \n 1. Slumpis - randomizes its move. \n 2. Klockis - chooses its move based on the clock. \n 3. Namnis - chooses its move based on your name. ");
                opponentPlayer = scanner.nextInt();
                scanner.nextLine();

                if (opponentPlayer < 1 || opponentPlayer > 3) {
                    throw new IllegalArgumentException("Invalid number, please choose a number between 1-3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Try again.");
                scanner.nextLine(); // Consume the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return opponentPlayer;
    }

    public static String validateOpponent(int opponentPlayer) {
        String opponent = "";
        if (opponentPlayer == 1) {
            opponent = "Slumpis";
        } else if (opponentPlayer == 2) {
            opponent = "Klockis";
        } else if (opponentPlayer == 3) {
            opponent = "Namnis";
        }
        return opponent;
    }

    public static void playAgain(boolean isNewGame, StatisticsCalculations statisticsCalculator, Player player) {

        System.out.println("Press 1 to show statistics, 2 to play again or type 'quit' to exit:");
        String userInput = scanner.nextLine().trim();

        if ("quit".equalsIgnoreCase(userInput)) {
            System.exit(0);
        } else if ("1".equals(userInput)) {
            statisticsCalculator.showStatistics(statisticsCalculator, isNewGame, player);
        } else if ("2".equals(userInput)) {
            isNewGame = false;
        } else {
            System.out.println("Invalid input. Please enter '1' to play again or 'quit' to exit.");
        }

        opponentPlayer = 0;
        runMenu(isNewGame, statisticsCalculator);
    }
}