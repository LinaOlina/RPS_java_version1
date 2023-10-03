package org.example.classes;

public class PlayerBuilder {

    public int opponentPlayer;
    String name;
    int rounds;
    int userScore;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setRounds(int rounds) {
        this.rounds = rounds;
        return this;
    }

    public PlayerBuilder setUserScore(int userScore) {
        this.userScore = userScore;
        return this;
    }
    public PlayerBuilder setOpponentPlayer(int opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
        return this;
    }

    public Player build() {
        return new Player(this);
    }

}
