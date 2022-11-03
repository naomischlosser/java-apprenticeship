package game;

import static org.junit.Assert.*;
// import static org.mockito.Mockito.*;
import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    String[] DICTIONARY = {"MAKERS"};
    WordChoser wordChoser = new WordChoser(DICTIONARY);
    Game game = new Game(wordChoser);
    assertEquals(String.valueOf("M_____"), game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    String[] DICTIONARY = {"MAKERS"};
    WordChoser wordChoser = new WordChoser(DICTIONARY);
    Game game = new Game(wordChoser);
    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  }
}
