package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;
  
public class GameTest {
  private static final WordChoser wordChoser = mock(WordChoser.class);

  @Before public void setupTests() {
    when(wordChoser.getRandomWordFromDictionary()).thenReturn("MOCKEDWORD");
  }

  @Test public void testGetsInitialWordToGuess() {
    Game game = new Game(wordChoser);
    assertEquals(String.valueOf("M_________"), game.getWordToGuess());
  }

  @Test public void testGetsWordToGuessWithGuessedLetterO() {
    Game game = new Game(wordChoser);
    game.guessLetter('O');
    assertEquals(String.valueOf("MO_____O__"), game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game(wordChoser);
    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  }

  @Test public void testGetsInitialGuessedLetters() {
    Game game = new Game(wordChoser);
    assertTrue(game.getGuessedLetters().isEmpty());
  }

  @Test public void testGuessTheCorrectLetterO() {
    Game game = new Game(wordChoser);
    game.guessLetter('O');
    assertEquals(Boolean.TRUE, game.guessLetter('O'));
    assertEquals(Character.valueOf('O'), game.getGuessedLetters().get(0));
  }

  @Test public void testGuessTheIncorrectLetterY() {
    Game game = new Game(wordChoser);
    assertEquals(Boolean.FALSE, game.guessLetter('Y'));
    assertEquals(Integer.valueOf(9), game.getRemainingAttempts());
  }
}
