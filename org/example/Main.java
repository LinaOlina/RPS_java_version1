package org.example;

import org.example.classes.StatisticsCalculations;

import static org.example.MainMenu.runMenu;

public class Main {
    public static boolean isNewGame = true;
    public static void main(String[] args) {
        StatisticsCalculations statisticsCalculator = new StatisticsCalculations
                (0, 0, 0, 0, 0, 0, 0, 1);
        runMenu(isNewGame, statisticsCalculator);
    }

    /*
    Spelaren skall kunna se statistik - hur många vinster har användaren totalt, hur stor andel av alla matcher har
    användaren vunnit samt hur stor andel av matcherna har spelaren vunnit av sina matcher mot respektive typ
    beskriven ovan (Slumpis, klockis, namnis)

     */
}