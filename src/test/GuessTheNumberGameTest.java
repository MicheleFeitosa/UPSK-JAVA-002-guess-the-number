package src.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.GuessTheNumberGame;
import src.HumanPlayer;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar false porque o palpite é menor que o número.")
   public void verificaPalpiteMenorQueNumero(){
        GuessTheNumberGame.setTargetNumber(49);
        boolean result = GuessTheNumberGame.checkGuess(35, new HumanPlayer("Nara"));
        assertFalse(result);

    }
    @Test
    @DisplayName("Deve retornar false porque o palpite é maior que o número.")
    public void verificaPalpiteMaiorQueNumero(){
        GuessTheNumberGame.setTargetNumber(65);
        boolean result = GuessTheNumberGame.checkGuess(90, new HumanPlayer("Nara"));
        assertFalse(result);

    }
    @Test
    @DisplayName("Deve retornar true porque o palpite é igual ao número.")
    public void verificaPalpiteIgual(){
        GuessTheNumberGame.setTargetNumber(74);
        boolean result = GuessTheNumberGame.checkGuess(74, new HumanPlayer("Nara"));
        assertTrue(result);

    }

}