package game;

public class Game {
  String word;

  public Game(String word) {
    this.word = word;
  }

  public String getWordToGuess() {
    // StringBuilder wordToGuess = new StringBuilder();

    // wordToGuess.append(word.charAt(0));
    // wordToGuess.append("_____");

    return word.charAt(0) + "_____";
  }
}
