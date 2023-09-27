package org.example.classes;

public class Builder {

    String name;
    int rounds;
    int userScore;

   /*
    public Builder(String name, int rounds, int userScore) {
        this.name = name;
        this.rounds = rounds;
        this.userScore = userScore;

    }

    */

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


    public Player build() {
        return new Player(this);
    }

}
