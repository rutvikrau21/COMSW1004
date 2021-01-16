Part 1:OddEven
- Added methods to the Game file which would
correspond to a class when no input are mentioned
- Created one computer with threshold value 0.5 as player 2
- Computer wins if the sum is an even number
- Choice method chooses the action for the computer
- Player instructions are part of the play method as 
it would not require its own class.
- Player1, user wins if sum is odd (3)
- Allows user to continue game as many times 
- Game resets for next round

Part 2: SimTest
- Added methods to allow two computers to compete
- Player 1 (Computer 1) wins if it is odd and has a threshold of 0.5
- Player 2 (Computer 2) wins if it is odd and has a threshold of 0.5
- choice method chooses the action for the computer
- Play method repeats the game for "game" number of turns
- Calculates the score after each turn and keeps track of cumulative
- If player wins he gets tokens from other player

Part 3: Simulations
- Two computers play 1000 games for varying thresholds
- Try to find if either player has an optimal strategy
- If for a particular threshold, the other player is only
minimising looses, and p1 wins on average that is a optimal threshold
- Find a row in which the outcome for entire row is positive
- Find the smallest value in that row
- Compares the smallest value in that row to other smallest values
in other rows 
- Save the largest smallest value of a row and its threshold
This is the current best case row with
- P1 has the advantage because it has a threshold value which corresponds 
to its average winnings being all positive, hence the entire row is positive 
- The threshold value also has the largest smallest positive winnings value 
of a row.
- If p1 has a positive smallest amount at threshold value, it has an unfair advantage. 
- t* is the row which has the largest smallest value in a row, hence is the optimal threshold.
- As such a value is present for P1, it has the optimal strategy at threshold
t* with average largest smallest earnings as given by the code.

value=earnings=amount. Same meanings