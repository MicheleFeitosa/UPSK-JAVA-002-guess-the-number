package src;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {

    private static Player player;

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int value = randomNumber.nextInt(100) + 1;
        System.out.println("Random number between 1 and 100: " + value);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

    }

    //public static String checkGuess(Player player){

   // }
}
