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

        Player currentPlayer = humanPlayer;

        while (true) {
            System.out.println("Round: " + currentPlayer.getName());

            int guess = currentPlayer.makeGuess();
            System.out.println(currentPlayer.getName() + ", enter your guess: " + guess);

            if (guess == targetNumber) {
                System.out.println("Correct! " + currentPlayer.getName() + " wins!");
                break;
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }


            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }
}
