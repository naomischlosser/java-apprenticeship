# Word guessing game
A CLI word guessing game for two players. The specification for the game is:

- When the game starts, it will prompt the user to enter the player's name.
- It will choose a random word from a list of words for both players.
- The game will then display the word to guess, with only the first letter visible (e.g H____ for "HOUSE").
- The player starts a counter of 10 attempts.
- The player will then be prompted to enter a letter they think might be in the word.
- If the letter is in the word, the game will display the word to guess, with the new letter visible.
- If the letter is not in the word, the game will display the same letters as before, and decrease the counter of remaining attempts.
- If the counter of attempts reaches zero, the player loses.
- If the player finds all the letters in the word, they win.

Written in Java using IntelliJ IDEA.

### Example output
```
Enter name for player 1: 
Tara
Enter name for player 2:
Will

Welcome! Today the word to guess is:
Tara: L_____
Will: D________

Tara: Enter one letter to guess (10 attempts remaining):
N
Right!
L_N__N

Will: Enter one letter to guess (10 attempts remaining):
V
Right!
D_V______

Tara: Enter one letter to guess (10 attempts remaining):
D
Right!
L_ND_N

Will: Enter one letter to guess (10 attempts remaining):
O
Right!
D_V__O___

(...)
```