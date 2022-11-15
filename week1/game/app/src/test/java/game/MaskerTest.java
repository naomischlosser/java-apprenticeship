package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

import java.util.ArrayList;

public class MaskerTest {
    @Test public void testGetsInitialMaskedWord() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        assertEquals(String.valueOf("M_________"), masker.getMaskedWord("MOCKEDWORD", guessedLetters));
    }

    @Test public void testGetsMaskedWordWithGuessedLetterO() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        guessedLetters.add('O');
        assertEquals(String.valueOf("MO_____O__"), masker.getMaskedWord("MOCKEDWORD", guessedLetters));
    }
}
