package org.example;

import org.example.classes.Builder;
import org.example.classes.Game;
import org.example.classes.GameHistory;
import org.example.classes.Player;

import java.util.Scanner;

import static org.example.classes.Game.gameLoop;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

public static void runMenu() {
    boolean correctNameInput = false;
    String name = "";
    int rounds = 0;

    System.out.println("Hi, and welcome to Rock, Paper, Scissors!");

    while (!correctNameInput) {
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

    while (rounds <= 0 || rounds > Game.maxRounds) {
        try {
            System.out.println("Please choose how many rounds you'd like to play - maximum of " + Game.maxRounds);
            rounds = scanner.nextInt();
            scanner.nextLine();

            if (rounds <= 0 || rounds > Game.maxRounds) {
                throw new IllegalArgumentException("Invalid number of rounds. Please choose between 1 and " + Game.maxRounds + ".");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    Player player = new Builder()
            .setName(name)
            .setRounds(rounds)
            .setUserScore(0)
            .build();
    gameLoop(player);


}
}
