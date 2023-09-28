package org.example.classes;

public class Player {
    private  String name;
    private  int rounds;
    private  int userScore;
    private int opponentPlayer;

    Player(Builder builder) {
        this.name = builder.name;
        this.rounds = builder.rounds;
        this.userScore = builder.userScore;
        this.opponentPlayer = builder.opponentPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }
    public int getOpponentPlayer() {
        return opponentPlayer;
    }
    public void setOpponentPlayer(int opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }
}
