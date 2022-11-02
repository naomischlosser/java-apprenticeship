package game;

public class Game {
  String word;
  StringBuilder wordToGuess;
  Integer remainingAttempts;

  public Game(String word) {
    this.word = word;
    this.wordToGuess = new StringBuilder(word);
    this.remainingAttempts = 10;
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
}
