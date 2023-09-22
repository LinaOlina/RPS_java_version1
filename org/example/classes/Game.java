package org.example.classes;

public class Game {
    private int endScore;
    private int maxScore = 11;


    public Game(int endScore, int maxScore) {
        this.endScore = endScore;
        this.maxScore = maxScore;
    }

    public int getEndScore() {
        return endScore;
    }

    public void setEndScore(int endScore) {
        this.endScore = endScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
}
