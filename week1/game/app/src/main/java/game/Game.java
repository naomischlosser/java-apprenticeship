package game;

import java.util.ArrayList;

public class Game {
  String word;
  StringBuilder wordToGuess;
  Integer remainingAttempts;
  ArrayList<Character> guessedLetters;

  public Game(WordChoser wordChoser) {
    word = wordChoser.getRandomWordFromDictionary();
    wordToGuess = new StringBuilder(word);
    remainingAttempts = 10;
    guessedLetters = new ArrayList<Character>();
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
      return true;
    } else {
      remainingAttempts -= 1;
      return false;
    }
  }
}
