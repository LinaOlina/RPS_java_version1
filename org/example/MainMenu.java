package org.example;

import org.example.classes.Player;

import java.util.Scanner;

import static org.example.classes.Game.gameLoop;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

public static void runMenu() {
    boolean correctNameInput = false;
    String name = "";

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

    int rounds = 0; // Initialize rounds to 0

    while (rounds <= 0 || rounds > 11) {
        try {
            System.out.println("Please choose how many rounds you'd like to play - maximum of 11");
            rounds = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (rounds <= 0 || rounds > 11) {
                throw new IllegalArgumentException("Invalid number of rounds. Please choose between 1 and 11.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Consume the invalid input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    Player player = new Player(name, rounds, 0);
    gameLoop(player);
}
}
