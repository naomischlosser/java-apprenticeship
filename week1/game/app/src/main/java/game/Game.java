package game;

import java.util.ArrayList;

public class Game {
  private String word;
  private StringBuilder wordToGuess;
  private Integer remainingAttempts = 10;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();

  public Game(WordChoser wordChoser) {
    word = wordChoser.getRandomWordFromDictionary();
    wordToGuess = new StringBuilder(word);
  }

  public String getWordToGuess() {
    for (int i = 1; i < word.length(); i++) {
      wordToGuess.replace(i, i + 1, "_");
    }

    return wordToGuess.toString();
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
