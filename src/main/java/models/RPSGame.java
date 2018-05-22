package models;

import java.util.HashMap;
import java.util.Map;

public class RPSGame {
    Map<String, String> playerWordPair = new HashMap<String, String>();
    public String checkWinner(String player1Word, String player2Word) {
        playerWordPair.put(player2Word, "player2");
        playerWordPair.put(player1Word, "palyer1");
        if (playerWordPair.containsKey("paper") && playerWordPair.containsKey("rock")){
            return playerWordPair.get("paper");
        } else if (playerWordPair.containsKey("scissors") && playerWordPair.containsKey("rock")){
            return playerWordPair.get("rock");
        } else if (playerWordPair.containsKey("scissors") && playerWordPair.containsKey("paper")){
            return playerWordPair.get("scissors");
        } else {
            return null;
        }
    }

}

