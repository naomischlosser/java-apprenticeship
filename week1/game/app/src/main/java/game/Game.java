package game;

public class Game {
  String word;
  StringBuilder wordToGuess;
  Integer remainingAttempts;

  public Game(WordChoser wordChoser) {
    word = wordChoser.getRandomWordFromDictionary();
    wordToGuess = new StringBuilder(word);
    remainingAttempts = 10;
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

  public Boolean guessLetter(Character letter) {
    return true;
  }
}
