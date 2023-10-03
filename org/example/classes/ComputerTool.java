package org.example.classes;
import org.example.States.PaperState;
import org.example.States.RockState;
import org.example.States.ScissorsState;
import org.example.States.ToolState;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ComputerTool {

    private static ToolState currentState;
    private Random random;

    public ComputerTool() {
        currentState = new RockState();
    }

    public void displayTool() {
      currentState.displayTool();
    }

    public void changeTool(Player player) {

        if(player.getOpponentPlayer() == 1) {
            slumpis();
        }
        else if (player.getOpponentPlayer() == 2) {
            klockis();
        }
        else if (player.getOpponentPlayer() == 3) {
            namnis(player);
        }
    }

    public void slumpis() {
        Random random = new Random();
        int choice = random.nextInt(3);
        System.out.println(choice);

        if (choice == 0) {
            currentState = new RockState();
        } else if (choice == 1) {
            currentState = new PaperState();
        } else {
            currentState = new ScissorsState();
        }
    }

    public void klockis() {

        LocalTime currentTime = LocalTime.now();
        int second = currentTime.getSecond() % 10;

        if (second == 1 || second == 3 || second == 9) {
            currentState = new RockState();
        } else if (second == 2 || second == 4 || second == 6) {
            currentState = new PaperState();
        } else if (second == 0 || second == 5 || second == 7 || second == 8) {
            currentState = new ScissorsState();
        }
    }

    public void namnis(Player player) {

        long seed = player.getName().hashCode() + System.currentTimeMillis();
        random = new Random();
        random.setSeed(seed);

        int randomNumber = random.nextInt(3);
        System.out.println(randomNumber);

        currentState = switch (randomNumber) {
            case 0 -> new RockState();
            case 1 -> new PaperState();
            case 2 -> new ScissorsState();
            default -> currentState;
        };
    }


    public void setCurrentState(ToolState state) {
        currentState = state;
    }


    public static ToolState getCurrentState() {
        return currentState;
    }
}
