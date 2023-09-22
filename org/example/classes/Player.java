package org.example.classes;

public class Player {

    private String name;
    private int rounds;
    private int choice;
    private int userScore;

    public Player(String name, int rounds, int choice, int userScore) {
        this.name = name;
        this.rounds = rounds;
        this.choice = choice;
        this.userScore = userScore;
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

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }
}