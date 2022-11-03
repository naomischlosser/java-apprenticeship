package game;

import java.util.Random;

public class WordChoser {
  String[] DICTIONARY;

  public WordChoser(String[] dictionary) {
    DICTIONARY = dictionary;
  }

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    Integer index = rand.nextInt(DICTIONARY.length);
    
    return DICTIONARY[index];
  }
}
