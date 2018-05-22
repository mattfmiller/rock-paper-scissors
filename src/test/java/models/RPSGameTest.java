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
    public void checkWinner_RockBeatsScissors_player2() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "player2";
        assertEquals(expected, testRPSGame.checkWinner("scissors", "rock"));
    }

    @Test
    public void checkWinner_ScissorsBeatPaper_player2() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "player2";
        assertEquals(expected, testRPSGame.checkWinner("paper", "scissors"));
    }

    @Test
    public void checkWinner_CheckForDraw_draw() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        String expected = "draw";
        assertEquals(expected, testRPSGame.checkWinner("paper", "paper"));
    }

    @Test
    public void checkEntry_CheckForValidEntry_false() throws Exception {
        RPSGame testRPSGame = new RPSGame();
        Boolean expected = false;
        assertEquals(expected, testRPSGame.checkEntry("hippo"));
    }
}