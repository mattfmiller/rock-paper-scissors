package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RPSGameTest {
    @Test
    public void checkWinner_PaperBeatsRock_player2() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "player2";
        assertEquals(expected, testRPSGame.checkWinner("rock", "paper"));

    }

    @Test
    public void checkWinner_EvaluateWinningOption_player2() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "player2";
        assertEquals(expected, testRPSGame.checkWinner("paper", "scissors"));
    }

    @Test
    public void checkWinner_CheckForDraw_Draw() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "draw";
        assertEquals(expected, testRPSGame.checkWinner("paper", "paper"));
    }
}