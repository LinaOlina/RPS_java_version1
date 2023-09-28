package org.example.classes;

import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;

import java.util.Random;

public class ComputerTool {

    private static ToolState currentState;

    public ComputerTool() {
        currentState = new RockState();
    }

    public void displayTool() {
      currentState.displayTool();
    }

    public void changeTool(Player player) {

        if(player.getOpponentPlayer() == 1) {
            slumpisTool();
        }
        else if (player.getOpponentPlayer() == 2) {
            klockisTool();
        }
        else if (player.getOpponentPlayer() == 3) {
            namnisTool(player);
        }
    }

    public void slumpisTool() {
        Random random = new Random();
        int choice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors

        if (choice == 0) {
            currentState = new RockState();
        } else if (choice == 1) {
            currentState = new PaperState();
        } else {
            currentState = new ScissorsState();
        }
    }

    public void klockisTool() {

    }

    public void namnisTool(Player player) {

    }


    public void setCurrentState(ToolState state) {
        currentState = state;
    }


    public static ToolState getCurrentState() {
        return currentState;
    }
}
