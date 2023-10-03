package org.example.classes;

import org.example.States.ToolState;

public class GameHistoryBuilder {
    int history_roundNo;
    String history_playerName;
    ToolState history_computerChoice;
    String history_playerChoice;
    int history_playerScore;
    int history_computerScore;


    public GameHistoryBuilder setHistory_roundNo(int history_roundNo) {
        this.history_roundNo = history_roundNo;
        return this;
    }

    public GameHistoryBuilder setHistory_playerName(String history_playerName) {
        this.history_playerName = history_playerName;
        return this;
    }

    public GameHistoryBuilder setHistory_computerChoice(ToolState history_computerChoice) {
        this.history_computerChoice = history_computerChoice;
        return this;
    }

    public GameHistoryBuilder setHistory_playerChoice(String history_playerChoice) {
        this.history_playerChoice = history_playerChoice;
        return this;
    }

    public GameHistoryBuilder setHistory_playerScore(int history_playerScore) {
        this.history_playerScore = history_playerScore;
        return this;
    }

    public GameHistoryBuilder setHistory_computerScore(int history_computerScore) {
        this.history_computerScore = history_computerScore;
        return this;
    }

    public GameHistory build() {
        return new GameHistory(this);
    }
}
