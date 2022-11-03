package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChoser wordChoser = new WordChoser();
    Game game = new Game(wordChoser);
    assertEquals(String.valueOf("M_____"), game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game();
    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  }
}
