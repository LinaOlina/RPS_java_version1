package org.example.classes;

public class Builder {

  private  String name;
   private int rounds;
   private int userScore;

    public Builder(String name, int rounds, int userScore) {
        this.name = name;
        this.rounds = rounds;
        this.userScore = userScore;

    }

    public Builder name(String name) {
        this.name = name;
        return this;
    }

    public Builder rounds(int rounds) {
        this.rounds = rounds;
        return this;
    }

    public Builder userScore(int userScore)      {
        this.userScore = userScore;
        return this;
    }

    public Player build() {
        return new Player(name, rounds, userScore);
    }

}
