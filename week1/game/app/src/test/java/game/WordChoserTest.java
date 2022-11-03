package game;

import static org.junit.Assert.*;

import org.junit.Test;


public class WordChoserTest {
  @Test public void testRandomWord() {
    String[] DICTIONARY = {"MAKERS"};
    WordChoser wordChoser = new WordChoser(DICTIONARY);
    assertEquals(String.valueOf("MAKERS"), wordChoser.getRandomWordFromDictionary());
  }
}
