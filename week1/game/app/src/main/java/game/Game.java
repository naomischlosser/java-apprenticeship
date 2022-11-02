package game;

public class Game {
  String word;
  StringBuilder wordToGuess;

  public Game(String word) {
    this.word = word;
    this.wordToGuess = new StringBuilder(word);
  }

  public String getWordToGuess() {
    int wordCount = word.length();
    for (int i = 0; i < wordCount; i++) {
      if (i != 0) {
        wordToGuess.replace(i, i + 1, "_");
      }
    }

    return wordToGuess.toString();
  }
}
