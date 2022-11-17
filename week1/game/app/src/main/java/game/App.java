/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private final BufferedReader input;
    private final PrintStream output;
    private final ArrayList<Game> games;
    private final Player player;
    private final int tries;

    public App(InputStream input, PrintStream output, ArrayList<Game> games, Player player, int tries) {
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = output;
        this.games = games;
        this.player = player;
        this.tries = tries;
    }

    public static void main(String[] args) throws IOException {
        Game game1 = new Game(new WordChoser(), new Masker());
        Game game2 = new Game(new WordChoser(), new Masker());

        App app = new App(System.in, System.out, new ArrayList<>(List.of(game1, game2)), new Player(), 10);
        app.run();
    }

    public void run() throws IOException {
        // print welcome message
        output.println("Welcome! Today the word to guess is:");
        output.printf("Player 1: %s\n", games.get(0).getWordToGuess());
        output.printf("Player 2: %s\n\n", games.get(1).getWordToGuess());

        // randomise player
        int firstPlayer = player.randomisePlayer();

        gameloop:
        for (int i = 0; i < tries; i++) {
            for (int j = 0; j < 2; j++) {
                // determine who is playing
                int player = (firstPlayer == 0) ? j : 1 - j;
                Game game = games.get(player);
                output.printf("Player %d: Enter one letter to guess (%d attempts remaining):\n", player+1, game.getRemainingAttempts());

                // check player's input
                Character letter = input.readLine().charAt(0);
                Boolean result = game.guessLetter(letter);
                output.println(result ? "Right!" : "Wrong...");

                // print wordToGuess
                output.println(game.getWordToGuess() + "\n");

                // check if game is won or lost
                if (game.isGameWon()) {
                    output.printf("Player %s won!", player+1);
                    break gameloop;
                } else if (game.isGameLost()) {
                    output.printf("Player %s lost...", player+1);
                    break gameloop;
                }
            }
        }
    }
}