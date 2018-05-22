package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RPSGameTest {
    @Test
    public void checkWinner_PaperBeatsRock_player2() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "player2";
        assertEquals(expected, RPSGame.checkWinner("rock", "paper"));

    }
}