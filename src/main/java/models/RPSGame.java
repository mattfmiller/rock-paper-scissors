package models;

import java.util.HashMap;
import java.util.Map;

public class RPSGame {
    Map<String, String> playerWordPair = new HashMap<String, String>();
    public String checkWinner(String player1Word, String player2Word) {
        playerWordPair.put(player2Word, "player2");
        playerWordPair.put(player1Word, "palyer1");
        return playerWordPair.get("paper");


    }


}

