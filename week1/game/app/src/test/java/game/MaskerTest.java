package game;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;

public class MaskerTest {
    @Test public void testGetsInitialMaskedWord() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        assertEquals("M_________", masker.getMaskedWord("MOCKEDWORD", guessedLetters));
    }

    @Test public void testGetsMaskedWordWithGuessedLetterO() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        guessedLetters.add('O');
        assertEquals("MO_____O__", masker.getMaskedWord("MOCKEDWORD", guessedLetters));
    }
}
