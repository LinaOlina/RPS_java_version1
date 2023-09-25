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

    public static ToolState changeTool() {
        Random random = new Random();
        int choice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors

        if (choice == 0) {
            currentState = new RockState();
        } else if (choice == 1) {
            currentState = new PaperState();
        } else {
            currentState = new ScissorsState();
        }

        return currentState;
    }


    public void setCurrentState(ToolState state) {
        currentState = state;
}


public static ToolState getCurrentState() {
        return currentState;
}
}
