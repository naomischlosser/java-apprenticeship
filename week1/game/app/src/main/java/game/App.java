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
        // enter players names
        output.println("Enter name for player 1:");
        String player1 = input.readLine();
        output.println("Enter name for player 2:");
        String player2 = input.readLine();
        String[] players = {player1, player2};

        // print welcome message
        output.println("\nWelcome! Today the word to guess is:");
        output.printf("%s: %s\n", player1, games.get(0).getWordToGuess());
        output.printf("%s: %s\n\n", player2, games.get(1).getWordToGuess());

        // randomise player
        int firstPlayer = player.randomisePlayer();

        gameloop:
        for (int i = 0; i < tries; i++) {
            for (int j = 0; j < 2; j++) {
                // determine who is playing
                int player = (firstPlayer == 0) ? j : 1 - j;
                String name = players[player];
                Game game = games.get(player);
                output.printf("%s: Enter one letter to guess (%d attempts remaining):\n", name, game.getRemainingAttempts());

                // check player's input
                Character letter = input.readLine().charAt(0);
                Boolean result = game.guessLetter(letter);
                output.println(result ? "Right!" : "Wrong...");

                // print wordToGuess
                output.println(game.getWordToGuess() + "\n");

                // check if game is won or lost
                if (game.isGameWon()) {
                    output.printf("%s won!", name);
                    break gameloop;
                } else if (game.isGameLost()) {
                    output.printf("%s lost...", name);
                    break gameloop;
                }
            }
        }
    }
}