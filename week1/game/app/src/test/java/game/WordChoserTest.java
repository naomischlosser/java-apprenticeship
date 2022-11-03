package game;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;


public class WordChoserTest {
  @Test public void testRandomWordFromDictionary() {
    WordChoser wordChoser = new WordChoser();
    String[] MOCK_DICT = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    assertTrue(Arrays.asList(MOCK_DICT).contains(wordChoser.getRandomWordFromDictionary()));
  }
}
