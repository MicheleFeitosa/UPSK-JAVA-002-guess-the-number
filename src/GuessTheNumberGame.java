package src;

import java.util.Random;

public class GuessTheNumberGame {

    private static Random numberRandom = new Random();
    private static int targetNumber;
    private static Player currentPlayer;


    public static void main(String[] args) {
        targetNumber = numberRandom.nextInt(100) + 1;
        Player humanPlayer = new HumanPlayer("Michele");
        Player computerPlayer = new ComputerPlayer("Computer");
        currentPlayer = humanPlayer;
        playGame(humanPlayer, computerPlayer);
    }

    public static void playGame(Player humanPlayer, Player computerPlayer) {
        while (true) {
            System.out.println("Round: " + currentPlayer.getName());
            int guess = currentPlayer.makeGuess();
            System.out.println(currentPlayer.getName() + ", enter your guess: " + guess);
            if (checkGuess(guess, currentPlayer)){
                break;
            }
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }

    public static boolean checkGuess(int guess, Player currentPlayer){
        if (guess == targetNumber) {
            System.out.println("Correct! " + currentPlayer.getName() + " wins!");
            return true;
        } else if (guess > targetNumber) {
            System.out.println("Too high!");
            return false;
        } else {
            System.out.println("Too low!");
            return false;
        }
    }

    public static void setTargetNumber(int targetNumber) {
        GuessTheNumberGame.targetNumber = targetNumber;
    }

}
