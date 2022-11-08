package game;

import java.util.ArrayList;

public class Game {
  private final String word;
  private final StringBuilder builder = new StringBuilder();
  private Integer remainingAttempts = 10;
  private final ArrayList<Character> guessedLetters = new ArrayList<>();

  public Game(WordChoser wordChoser) {
    word = wordChoser.getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    for (int i = 0; i < word.length(); i++) {
      Character currentLetter = word.charAt(i);
      if (i == 0) {
        // always show first letter
        builder.append(currentLetter);
      } else {
        // show guessed letter(s)
        if (guessedLetters.contains(currentLetter)) {
            builder.append(currentLetter);
        } else {
          builder.append("_");
        }
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