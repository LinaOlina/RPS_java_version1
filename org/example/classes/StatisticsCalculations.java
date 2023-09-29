package org.example.classes;


import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculations {

    private int slumpisWins;
    private int klockisWins;
    private int namnisWins;
    private int playerWinsAgainstSlumpis;
    private int playerWinsAgainstKlockis;
    private int playerWinsAgainstNamnis;


    private List<StatisticsCalculations> wins = new ArrayList<>();

    public StatisticsCalculations(int slumpisWins, int klockisWins, int namnisWins, int playerWinsAgainstSlumpis, int playerWinsAgainstKlockis, int playerWinsAgainstNamnis) {
        this.slumpisWins = slumpisWins;
        this.klockisWins = klockisWins;
        this.namnisWins = namnisWins;
        this.playerWinsAgainstSlumpis = playerWinsAgainstSlumpis;
        this.playerWinsAgainstKlockis = playerWinsAgainstKlockis;
        this.playerWinsAgainstNamnis = playerWinsAgainstNamnis;
    }

    public int getSlumpisWins() {
        return slumpisWins;
    }

    public void setSlumpisWins(int slumpisWins) {
        this.slumpisWins = slumpisWins;
    }

    public int getKlockisWins() {
        return klockisWins;
    }

    public void setKlockisWins(int klockisWins) {
        this.klockisWins = klockisWins;
    }

    public int getNamnisWins() {
        return namnisWins;
    }

    public void setNamnisWins(int namnisWins) {
        this.namnisWins = namnisWins;
    }

    public int getPlayerWinsAgainstSlumpis() {
        return playerWinsAgainstSlumpis;
    }

    public void setPlayerWinsAgainstSlumpis(int playerWinsAgainstSlumpis) {
        this.playerWinsAgainstSlumpis = playerWinsAgainstSlumpis;
    }

    public int getPlayerWinsAgainstKlockis() {
        return playerWinsAgainstKlockis;
    }

    public void setPlayerWinsAgainstKlockis(int playerWinsAgainstKlockis) {
        this.playerWinsAgainstKlockis = playerWinsAgainstKlockis;
    }

    public int getPlayerWinsAgainstNamnis() {
        return playerWinsAgainstNamnis;
    }

    public void setPlayerWinsAgainstNamnis(int playerWinsAgainstNamnis) {
        this.playerWinsAgainstNamnis = playerWinsAgainstNamnis;
    }

    public static void calculatePlayerWins(int a, int b){

        System.out.println("Player wins Test!!!");

    }
    public static void calculateSlumpisWins(int a, int b){

        System.out.println("Slumpis wins Test!!!");

    }
    public static void calculateNamnisWins(int a, int b){

        System.out.println("Namnis wins Test!!!");

    }
    public static void calculateKlockisWins(int a, int b){

        System.out.println("Klockis wins Test!!!");

    }

    public static void calculateMatch(int playerScore, int opponantScore, int opponentPlayer){
        if (playerScore > opponantScore && opponentPlayer == 1){
            //Spelare har vunnit mot slumpis
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(0, 0, 0, 1, 0, 0);
        } else if (playerScore > opponantScore && opponentPlayer == 2){
            //Spelare har vunnit mot Klockis
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(0, 0, 0, 0, 1, 0);
        } else if (playerScore > opponantScore && opponentPlayer == 3){
            //Spelare har vunnit mot Namnis
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(0, 0, 0, 0, 0, 1);

        } else if(opponantScore > playerScore && opponentPlayer == 1){
            //Slumpis har vunnit mot player
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(1, 0, 0, 0, 0, 0);

        } else if (opponantScore > playerScore && opponentPlayer == 2){
            //Klockis har vunnit mot spelare
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(0, 1, 0, 0, 0, 0);

        } else if (opponantScore > playerScore && opponentPlayer == 3) {
            //Namnis har vunnit mot spelare
            StatisticsCalculations statisticsCalculator = new StatisticsCalculations(0, 0, 1, 0, 0, 0);

        }
    }

}
