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

  public static void main(String[] args) {}

  public String getWordToGuess() {
    for (int i = 1; i < word.length(); i++) {
      Character letter = word.charAt(i);

      if (guessedLetters.contains(letter)) {
        int j = word.indexOf(letter);
        while (j >= 0) {
          wordToGuess.replace(j, j + 1, letter.toString());
          j = word.indexOf(letter, j + 1);
        }
      } else {
        wordToGuess.replace(i, i + 1, "_");
      }
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