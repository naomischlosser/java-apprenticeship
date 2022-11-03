package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;

public class GameTest {
  private static final WordChoser wordChoser = mock(WordChoser.class);

  @Before public void setupTests() {
    when(wordChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");
  }

  @Test public void testGetsWordToGuess() {
    Game game = new Game(wordChoser);
    assertEquals(String.valueOf("M_____"), game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game(wordChoser);
    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  }
}
