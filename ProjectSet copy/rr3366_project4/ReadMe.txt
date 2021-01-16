Game
Creates two consurtuots for testhand and interactive
Seperate play mehthods for test and interactive
Testhand takes string as inout and converts it into an int
Adds test cards into a hand to check
Interactive:
Seperate methods for deal, bet, reset replace and print
prompts user for an amount to bet
User has 100 bankroll at the start which reduces as they bet
deals and adds card to hand in deal method
Prints out cards dealt to the user in print method
checks hand using checkhand method using checkhand method
Prints out result of check hand and updates winnigns 
Prints option to play again in reset method
Resets the entire game in reset method

Check hand:returns string and winnings
String containst which combination obtained
RF: Checks if all same suit and then checks for 
card in order of A,10,J,Q,K. As all are sorted 
SF: Checks if both strau=ight and flush are true
4K: Checks if 4 cards are same
Checks if card 0 and card 3 are same or if card 1 or 4 are same
As they are sorted only XXXXY or YXXXX
Fullhouse: 3 of a kind and a pair
xxxyy or yyxxx
checks if first two same and then if third same checks if next two same
if third not same checks if next 3 same
flush: all same suit
checks each acrd suit with first
Staright: ordered
checks if difference between first and 4th card is 4th
Special case for when first card is ace and last king:
Checks if difference is 3 for 2nd and last card
3k:Checks if 3 of same rank
XXXAB or ABXXX or AXXXB
2P:Checks if two pairs
As 4K is false we dont need to worry about it
Checks if two consequitive cards are same or not if same updates counter
If counter is 2 then two pair
1P:
Checks if two cards are the same if same then updates counter
if counter is 1 then true

Card
constructor takes two ints and suits and rank
Compare to returns 0 if same cards -1 if less than and 1 if more
comapres on rank breaks tie based on suits
suit() converts suit to string
rank() converts rank to string
toString converts suit and rank to strings
getSuit returns suit as int
getRank returns rank as int

Player
Public methods so can be accesed from game class
Adds card to hand
removes card from hand
Returns bankroll
returns bet 
returns hand
returns a specific card in hand
returns hand size
sorts hand
winnings calculates new bankroll after round
Restarts hand to play again

Deck
Creates a deck of 52 cards
Creates 52 cards for the deck
shuffles deck using collections.shuffle, converting the array to arraylist
deals and returns the top cards
top has to be added first as return is end of method
resets the deck by shuffling and top to be 0