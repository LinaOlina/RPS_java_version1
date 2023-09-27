package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {

    private String history_computerChoice;
    private String history_playerChoice;
    private String history_roundResult;
    private String history_playerScore;
    private String getHistory_computerScore;
    List<GameHistory> gameResult = new ArrayList<>();

    public GameHistory(String history_computerChoice, String history_playerChoice, String history_roundResult, String history_playerScore, String getHistory_computerScore) {
        this.history_computerChoice = history_computerChoice;
        this.history_playerChoice = history_playerChoice;
        this.history_roundResult = history_roundResult;
        this.history_playerScore = history_playerScore;
        this.getHistory_computerScore = getHistory_computerScore;
    }

    public String getHistory_computerChoice() {
        return history_computerChoice;
    }

    public void setHistory_computerChoice(String history_computerChoice) {
        this.history_computerChoice = history_computerChoice;
    }

    public String getHistory_playerChoice() {
        return history_playerChoice;
    }

    public void setHistory_playerChoice(String history_playerChoice) {
        this.history_playerChoice = history_playerChoice;
    }

    public String getHistory_roundResult() {
        return history_roundResult;
    }

    public void setHistory_roundResult(String history_roundResult) {
        this.history_roundResult = history_roundResult;
    }

    public String getHistory_playerScore() {
        return history_playerScore;
    }

    public void setHistory_playerScore(String history_playerScore) {
        this.history_playerScore = history_playerScore;
    }

    public String getGetHistory_computerScore() {
        return getHistory_computerScore;
    }

    public void setGetHistory_computerScore(String getHistory_computerScore) {
        this.getHistory_computerScore = getHistory_computerScore;
    }

    public List <GameHistory> getGameResult() {
        return gameResult;
    }

    public void setGameResult(List<GameHistory> gameResult) {
        this.gameResult = gameResult;
    }

    public List <GameHistory> addingRoundInformation(String history_computerChoice, String history_playerChoice, String history_roundResult, String history_playerScore, String History_computerScore) {
        GameHistory round = new GameHistory(history_computerChoice, history_playerChoice, history_roundResult, history_playerScore, History_computerScore);
        gameResult.add(round);
        return gameResult;
    }

}
