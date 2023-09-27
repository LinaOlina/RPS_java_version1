package org.example.classes;

import org.example.States.ToolState;

import java.util.ArrayList;
import java.util.List;

import static org.example.classes.Game.gameHistoryList;

public class GameHistory {

    private int history_roundNo;
    private String history_playerName;
    private ToolState history_computerChoice;
    private String history_playerChoice;
    private int history_playerScore;
    private int history_computerScore;


    public GameHistory(int history_roundNo, String history_playerName, ToolState history_computerChoice, String history_playerChoice, int history_playerScore, int history_computerScore) {
        this.history_roundNo = history_roundNo;
        this.history_playerName = history_playerName;
        this.history_computerChoice = history_computerChoice;
        this.history_playerChoice = history_playerChoice;
        this.history_playerScore = history_playerScore;
        this.history_computerScore = history_computerScore;
    }

    public int getHistory_roundNo() {
        return history_roundNo;
    }

    public void setHistory_roundNo(int history_roundNo) {
        this.history_roundNo = history_roundNo;
    }

    public String getHistory_playerName() {
        return history_playerName;
    }

    public void setHistory_playerName(String history_playerName) {
        this.history_playerName = history_playerName;
    }


    public int getHistory_computerScore() {
        return history_computerScore;
    }

    public void setHistory_computerScore(int history_computerScore) {
        this.history_computerScore = history_computerScore;
    }

    public ToolState getHistory_computerChoice() {
        return history_computerChoice;
    }

    public void setHistory_computerChoice(ToolState history_computerChoice) {
        this.history_computerChoice = history_computerChoice;
    }

    public String getHistory_playerChoice() {
        return history_playerChoice;
    }

    public void setHistory_playerChoice(String history_playerChoice) {
        this.history_playerChoice = history_playerChoice;
    }

    public int getHistory_playerScore() {
        return history_playerScore;
    }

    public void setHistory_playerScore(int history_playerScore) {
        this.history_playerScore = history_playerScore;
    }

    public int getGetHistory_computerScore() {
        return history_computerScore;
    }

    public void setGetHistory_computerScore(int getHistory_computerScore) {
        this.history_computerScore = getHistory_computerScore;
    }

    public static void printGameHistory() {
        for (GameHistory round : gameHistoryList) {
            System.out.println("ROUND NUMBER: " + round.history_roundNo + " \n -------------- \n" +
                     round.history_playerName +
                    ", choice: " + round.history_playerChoice +
                    "\n Computer choice: " + round.history_computerChoice +
                    " \n " +round.history_playerName+ " score: " + round.history_playerScore +
                    ", Computer score: " + round.history_computerScore + "\n \n ");
        }
    }
}