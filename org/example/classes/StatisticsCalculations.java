package org.example.classes;
import org.example.MainMenu;

import java.text.DecimalFormat;

public class StatisticsCalculations {

    private int slumpisWins;
    private int klockisWins;
    private int namnisWins;
    private int playerWinsAgainstSlumpis;
    private int playerWinsAgainstKlockis;
    private int playerWinsAgainstNamnis;
    private int totalWinsForPlayer;
    private int matchNumber;

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
        return "Slumpis Wins: " +slumpisWins + "\n" +
                "Klockis Wins: " + klockisWins  + "\n" +
                "Namnis Wins: " + namnisWins  + "\n" +
                "Player Wins Against Slumpis: " + playerWinsAgainstSlumpis + "\n" +
                "Player Wins Against Klockis: " + playerWinsAgainstKlockis + "\n" +
                "Player Wins Against Namnis: " + playerWinsAgainstNamnis + "\n" +
                "Total Wins for Player: " + totalWinsForPlayer;
    }

    public void calculateMatch(int playerScore, int opponentScore, int opponentPlayer) {

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
        setMatchNumber(getMatchNumber()+1);
    }

    public void showStatistics(StatisticsCalculations statisticsCalculator, boolean isNewGame, Player player) {

        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double wonGamesForSlumpis = ((double)slumpisWins / (matchNumber-1)) * 100;
        double wonGamesForKlockis = ((double)klockisWins / (matchNumber-1)) * 100;
        double wonGamesForNamnis = ((double)namnisWins / (matchNumber-1)) * 100;
        double playerWonAgainstSlumpis = ((double)playerWinsAgainstSlumpis / (matchNumber-1)) * 100;
        double playerWonAgainstKlockis = ((double)playerWinsAgainstKlockis / (matchNumber-1)) * 100;
        double playerWonAgainstNamnis = ((double)playerWinsAgainstNamnis / (matchNumber-1)) * 100;
        double totalWinsForPlayerPercentage = ((double)totalWinsForPlayer / (matchNumber-1)) * 100;

        System.out.println("Slumpis has won " + decimalFormat.format(wonGamesForSlumpis) + " % of the games.");
        System.out.println("Namnis has won " + decimalFormat.format(wonGamesForNamnis) + " % of the games.");
        System.out.println("Klockis has won " + decimalFormat.format(wonGamesForKlockis) + " % of the games.");
        System.out.println(player.getName() + " has won " + decimalFormat.format(playerWonAgainstSlumpis) + " % of the games against slumpis.");
        System.out.println(player.getName() + " has won " + decimalFormat.format(playerWonAgainstKlockis) + " % of the games against klockis.");
        System.out.println(player.getName() + " has won " + decimalFormat.format(playerWonAgainstNamnis) + " % of the games against namnis.");
        System.out.println(player.getName() + " has won " + decimalFormat.format(totalWinsForPlayerPercentage) + " % of all games.");
        MainMenu.playAgain(isNewGame, statisticsCalculator, player);
    }

}
