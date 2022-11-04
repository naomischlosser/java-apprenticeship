package game;

import java.util.ArrayList;

public class Game {
  private String word;
  private StringBuilder builder;
  private Integer remainingAttempts = 10;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();

  public Game(WordChoser wordChoser) {
    word = wordChoser.getRandomWordFromDictionary();
    builder = new StringBuilder(word);
  }

  public static void main(String[] args) {}

  public String getWordToGuess() {
    for (int i = 1; i < word.length(); i++) {
      Character currentLetter = word.charAt(i);

      if (guessedLetters.contains(currentLetter)) {
        int j = word.indexOf(currentLetter);
        while (j >= 0) {
          builder.replace(j, j + 1, currentLetter.toString());
          j = word.indexOf(currentLetter, j + 1);
        }
      } else {
        builder.replace(i, i + 1, "_");
      }
    }

    return builder.toString();
  }

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  public ArrayList<Character> getGuessedLetters() {
    return guessedLetters;
  }

  public Boolean guessLetter(Character letter) {
    if (word.contains(letter.toString())) {
      guessedLetters.add(letter);
      return true;
    } else {
      remainingAttempts--;
      return false;
    }
  }
}