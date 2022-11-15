package game;

import java.util.ArrayList;

public class Masker {
    private final StringBuilder builder = new StringBuilder();
    public String getMaskedWord(String wordToGuess, ArrayList<Character> guessedLetters) {
        builder.setLength(0);
        for (int i = 0; i < wordToGuess.length(); i++) {
            Character currentLetter = wordToGuess.charAt(i);
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
}
