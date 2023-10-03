package org.example.classes;

import org.example.States.ToolState;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.example.classes.Game.gameHistoryList;

public class GameHistory {

    private final int history_roundNo;
    private final String history_playerName;
    private final ToolState history_computerChoice;
    private final String history_playerChoice;
    private final int history_playerScore;
    private final int history_computerScore;

    public GameHistory(GameHistoryBuilder builder) {
        this.history_roundNo = builder.history_roundNo;
        this.history_playerName = builder.history_playerName;
        this.history_computerChoice = builder.history_computerChoice;
        this.history_playerChoice = builder.history_playerChoice;
        this.history_playerScore = builder.history_playerScore;
        this.history_computerScore = builder.history_computerScore;
    }


    public static void printGameHistory() {

        for (GameHistory round : gameHistoryList) {

            String computerChoice = round.history_computerChoice.toString();
            computerChoice = computerChoice.substring(0, computerChoice.length() - "state".length());

            System.out.println("ROUND NUMBER: " + round.history_roundNo + " \n -------------- \n" +
                    round.history_playerName +"'s"+
                    " choice: " + round.history_playerChoice +
                    "\nComputer's choice: " + computerChoice +
                    " \n" +round.history_playerName+ " score: " + round.history_playerScore +
                    " - Computer score: " + round.history_computerScore + "\n ");
        }
        List<GameHistory> sortedGameHistory = gameHistoryList.stream()
                .sorted(Comparator.comparing(round -> round.history_playerName)).toList();

        System.out.println("Final outcome: ");

        AtomicBoolean printDivider = new AtomicBoolean(false);
        int match_Number = 1;
        for (GameHistory round : sortedGameHistory) {
            if (round.history_roundNo == 1) {
                printDivider.set(true);
            }
            if (printDivider.get()) {
                System.out.println("\nMatch number: " + match_Number);
                match_Number++;
                System.out.println("-------------- ");
                printDivider.set(false);
            }

            System.out.println("Round " + round.history_roundNo + " - " + round.history_playerName + " : " + round.history_playerScore + " | " +
                    "Computer: " + round.history_computerScore);

    }
    }
}
