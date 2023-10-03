package org.example.classes;

public class Player {
    private final String name;
    private  int rounds;
    private  int userScore;
    private final int opponentPlayer;

   Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.rounds = builder.rounds;
        this.userScore = builder.userScore;
        this.opponentPlayer = builder.opponentPlayer;
    }

    public String getName() {
        return name;
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
}
