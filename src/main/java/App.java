import models.RPSGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("I'm a Rock paper and scissor game application!");
            try {
                RPSGame rpsGame = new RPSGame();
                System.out.println("Player1: enter a word from paper, scissors or rock:");
                String player1Word = bufferedReader.readLine();
                if(rpsGame.checkEntry(player1Word) == false){
                    System.out.println("error: entry not valid");
                    break;
                }
                System.out.println("Player2: enter a word from paper, scissors or rock:");
                String player2Word = bufferedReader.readLine();
                if(rpsGame.checkEntry(player2Word) == false){
                    System.out.println("error: entry not valid");
                    break;
                }
                String winner = rpsGame.checkWinner(player1Word, player2Word);

                if (winner.equals("draw")) {
                    System.out.println("It's a draw!");
                } else {
                    System.out.println(winner + " wins");
                }

                System.out.println("Play again? - yes or no");
                String userContinue = bufferedReader.readLine();
                if ( userContinue.equals("no")){
                    programRunning = false;
                }

            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
