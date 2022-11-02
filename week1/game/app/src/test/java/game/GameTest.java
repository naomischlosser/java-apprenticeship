package game;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game("MAKERS");
    assertEquals("M_____", game.getWordToGuess());
  }
}
