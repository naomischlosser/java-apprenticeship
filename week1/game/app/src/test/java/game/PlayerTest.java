package game;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class PlayerTest {
  @Test public void testRandomPlayer() {
    Player player = new Player();
    Integer[] MOCK_PLAYERS = {0, 1};
    assertTrue(Arrays.asList(MOCK_PLAYERS).contains(player.randomisePlayer()));
  }
}
