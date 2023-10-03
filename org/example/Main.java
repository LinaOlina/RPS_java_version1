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
}