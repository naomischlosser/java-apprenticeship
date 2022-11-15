package game;

import java.util.ArrayList;
import java.util.Objects;

public class Game {
  private final String word;
  private final Masker masker;
  private Integer remainingAttempts = 10;
  private final ArrayList<Character> guessedLetters = new ArrayList<>();

  public Game(WordChoser wordChoser, Masker masker) {
    this.word = wordChoser.getRandomWordFromDictionary();
    this.masker = masker;
  }

  public String getWordToGuess() {
    return masker.getMaskedWord(word, guessedLetters);
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

  public Boolean isGameLost() {
    return remainingAttempts == 0;
  }

  public Boolean isGameWon() {
    return Objects.equals(word, getWordToGuess());
  }
}