package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game("MAKERS");
    assertEquals(String.valueOf("M_____"), game.getWordToGuess());
  }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game("MAKERS");
    assertEquals(Integer.valueOf(10), game.getRemainingAttempts());
  }
}
