package org.example;

import org.example.classes.Player;

import java.util.Scanner;

import static org.example.classes.Game.gameLoop;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

public static void runMenu() {
    System.out.println("Hi and welcome to rsvp");
    System.out.println("Please input your name");
    String name = scanner.nextLine();
    System.out.println("Please choose how many rounds you'd like to play - maximum of 11");
    int rounds = scanner.nextInt();

    Player player = new Player(name, rounds,  0);
    gameLoop(player);
}
}
