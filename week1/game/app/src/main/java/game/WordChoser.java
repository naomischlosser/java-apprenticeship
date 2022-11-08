package game;

import java.util.Random;

public class WordChoser {
  private static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

  public static void main(String[] args) {}
  
  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    int index = rand.nextInt(DICTIONARY.length);

    return DICTIONARY[index];
  }
}
