package models;

import java.util.HashMap;
import java.util.Map;

public class RPSGame {
    public Boolean checkEntry(String playerWord) {
        if(playerWord.equals("paper") || playerWord.equals("rock") || playerWord.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    Map<String, String> playerWordPair = new HashMap<String, String>();
    public String checkWinner(String player1Word, String player2Word) {
        if (player1Word.equals(player2Word)){
            return "draw";
        } else {
            playerWordPair.put(player2Word, "player2");
            playerWordPair.put(player1Word, "player1");
            if (playerWordPair.containsKey("paper") && playerWordPair.containsKey("rock")) {
                return playerWordPair.get("paper");
            } else if (playerWordPair.containsKey("scissors") && playerWordPair.containsKey("rock")) {
                return playerWordPair.get("rock");
            } else if (playerWordPair.containsKey("scissors") && playerWordPair.containsKey("paper")) {
                return playerWordPair.get("scissors");
            } else {
                return null;
            }
        }
    }

}

