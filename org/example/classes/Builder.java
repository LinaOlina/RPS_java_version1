package org.example.classes;

public class Builder {

    public int opponentPlayer;
    String name;
    int rounds;
    int userScore;

    public  Builder setName(String name) {
        this.name = name;
        return this;
    }

    public  Builder setRounds(int rounds) {
        this.rounds = rounds;
        return this;
    }

    public  Builder setUserScore(int userScore) {
        this.userScore = userScore;
        return this;
    }
    public Builder setOpponentPlayer(int opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
        return this;
    }

    public Player build() {
        return new Player(this);
    }

}
