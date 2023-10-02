package org.example.classes;


import com.sun.security.jgss.GSSUtil;
import org.example.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculations {

    private int slumpisWins;
    private int klockisWins;
    private int namnisWins;
    private int playerWinsAgainstSlumpis;
    private int playerWinsAgainstKlockis;
    private int playerWinsAgainstNamnis;
    private int totalWinsForPlayer;
    private int matchNumber;

    //List <Integer> matchCounter = new ArrayList<>();



    public StatisticsCalculations(int slumpisWins, int klockisWins, int namnisWins, int playerWinsAgainstSlumpis, int playerWinsAgainstKlockis, int playerWinsAgainstNamnis, int totalWinsForPlayer, int matchNumber) {
        this.slumpisWins = slumpisWins;
        this.klockisWins = klockisWins;
        this.namnisWins = namnisWins;
        this.playerWinsAgainstSlumpis = playerWinsAgainstSlumpis;
        this.playerWinsAgainstKlockis = playerWinsAgainstKlockis;
        this.playerWinsAgainstNamnis = playerWinsAgainstNamnis;
        this.totalWinsForPlayer = totalWinsForPlayer;
        this.matchNumber = matchNumber;
    }


    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }



    public int getTotalWinsForPlayer() {
        return totalWinsForPlayer;
    }

    public void setTotalWinsForPlayer(int totalWinsForPlayer) {
        this.totalWinsForPlayer = totalWinsForPlayer;
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

    @Override
    public String toString() {
        return "Slumpis Wins: " + slumpisWins + "\n" +
                "Klockis Wins: " + klockisWins + "\n" +
                "Namnis Wins: " + namnisWins + "\n" +
                "Player Wins Against Slumpis: " + playerWinsAgainstSlumpis + "\n" +
                "Player Wins Against Klockis: " + playerWinsAgainstKlockis + "\n" +
                "Player Wins Against Namnis: " + playerWinsAgainstNamnis + "\n" +
                "Total Wins for Player: " + totalWinsForPlayer;
    }

    public void calculateMatch(int playerScore, int opponentScore, int opponentPlayer, StatisticsCalculations statisticsCalculator) {

        if (playerScore > opponentScore && opponentPlayer == 1) {
            setTotalWinsForPlayer(getTotalWinsForPlayer()+1);
            setPlayerWinsAgainstSlumpis(getPlayerWinsAgainstSlumpis()+1);
        } else if (playerScore > opponentScore && opponentPlayer == 2) {
            setTotalWinsForPlayer(getTotalWinsForPlayer()+1);
            setPlayerWinsAgainstKlockis(getPlayerWinsAgainstKlockis()+1);
        } else if (playerScore > opponentScore && opponentPlayer == 3) {
            setTotalWinsForPlayer(getTotalWinsForPlayer()+1);
            setPlayerWinsAgainstNamnis(getPlayerWinsAgainstNamnis()+1);
        } else if (opponentScore > playerScore && opponentPlayer == 1) {
            setSlumpisWins(getSlumpisWins()+1);
        } else if (opponentScore > playerScore && opponentPlayer == 2) {
            setKlockisWins(getKlockisWins()+1);
        } else if (opponentScore > playerScore && opponentPlayer == 3) {
            setNamnisWins(getNamnisWins()+1);
        }
        //setMatchNumber(getMatchNumber()+1);
        //System.out.println(statisticsCalculator);
    }

    public void showStatistics(StatisticsCalculations statisticsCalculator, boolean isNewGame) {
        /*
            private int slumpisWins;
    private int klockisWins;
    private int namnisWins;
    private int playerWinsAgainstSlumpis;
    private int playerWinsAgainstKlockis;
    private int playerWinsAgainstNamnis;
    private int totalWinsForPlayer;
    private int matchNumber;
         */
        System.out.println(statisticsCalculator);
        MainMenu.playAgain(isNewGame, statisticsCalculator);
    }

}
