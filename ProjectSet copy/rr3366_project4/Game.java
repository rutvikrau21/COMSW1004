/*
 * Rutvik Rau 
 * rr3366
 * Creates an interactive or test case video poker game
 * Calculates the winnings and allows multiple rounds 
 */


import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.util.Collection;
import java.util.ArrayList;

public class Game {
	
	private Player p;
	private Deck cards;
	private Scanner input; //scanner for user input
    private String[] testHand;//Saves command line args
    private int testSuit;//Tester sui
    private int testRank;//Tester rank
    private double win; //keep track of winning 
    private boolean again; //Ask user to play again
	
	
	public Game(String[] testHand){
        this.testHand = testHand;
        p = new Player(); //instantiate player
        cards = new Deck(); //instantiate deck 
        int testSuit = 0; //Suit for testhand
        int testRank = 0; //suit for rank
        
        for(String c: testHand) {
            //Check first character & save into suit
            if(c.charAt(0) == 'c'){
                testSuit = 1;
            }
            else if(c.charAt(0) == 'd'){
                testSuit = 2;
            }
            else if(c.charAt(0) == 'h'){
                testSuit = 3;
            }
            else if(c.charAt(0) == 's'){
                testSuit = 4;
            }
            //check 2nd char for number
            testRank = Integer.parseInt(c.substring(1));
            
            Card nxtCard = new Card(testSuit,testRank);
            p.addCard(nxtCard);
                
            }
	}
	
	public Game(){
        
        p = new Player();//Player instance
        cards = new Deck();//deck of cards
        testHand = new String[0];//Test hand array
        win = 0;//win amt counter
        cards.shuffle();
        input = new Scanner(System.in);
	}
    public void play(){
        if(testHand.length != 0) {//Testhand
            String result = checkHand(p.getHand());//saves string
            System.out.println(result);//prints string
        }
        else { //Interactive game  
                System.out.println("Welcome to video poker!");//Welcome message
                System.out.println("Bankroll is " + p.getBankroll());//Bankroll
                bet();//Asks user for bet
                deal();//deal cards
                System.out.println("Your cards are: ");//prints cards
                printcard();
                System.out.println("Which card to replace?");
                System.out.println("1 for first & 5 for last, if none 0");
                replace();//replace cards
                System.out.println("----------");
                System.out.println("Your cards are: ");
                printcard();
                System.out.println(checkHand(p.getHand()));
                p.winnings(win);//Calculares winnings
                System.out.println("Your new bankroll is " + p.getBankroll());
                reset();//resets games & asks to play again 
        }
    }
    public void deal() {
        Card add = null;
        for (int i = 0;i<5;i++) {//repeats 5 times
            add = cards.deal();//deal card
            for(Card m:p.getHand()) {
                if(m.compareTo(add) == 0)//checks if card is in hand 
                    add = cards.deal();
            }
            p.addCard(add);//add card
            } 
    }
    public void replace() { //replaces cards if required
        //List to know which cards to replace    
        ArrayList<Card> replaceCard = new ArrayList<Card>(); 
        int replace;
        replace = input.nextInt() -1 ;//Store input
        while (replace != -1) { //User does not select 0
            //Add selected card to array
            replaceCard.add(p.getHand().get(replace));
            System.out.println("Replace one more?");
            replace = input.nextInt() -1 ;
        }
        for(Card card:replaceCard) {
            p.removeCard(card);//Remove card in array
        }
        //Add remaining cards
        for(int i = 0; i < replaceCard.size(); i++){
            p.addCard(cards.deal()); //add card from top of deck
        }
    }
    
    public void bet() {//asks & saves bet amount 
        do {
            //Ask bet amt
            System.out.println("How much would you like to bet?"); 
            p.bets(input.nextDouble());//Save bet
            } while(p.getBet()>5);
        System.out.println("Bankroll is " + p.getBankroll());
        System.out.println("");
    }
    
    public void reset() { //resets game
        System.out.println("Do you want to play again? 1 yes, 0 no"); 
                if(input.nextInt() == 1){ //if player wants to play on reset
                    p.reset(); //restart player
                    cards.reset(); //reset deck
                    win = 0; //Win = 0
                    play(); //start again
                }
    }
    
    public void printcard() { //prints card in hand
                for(int i = 0;i<5;i++)
                    System.out.println(p.getCard(i));//Prints cards
    }
	
    public String checkHand(ArrayList<Card> hand){
        
		// this method should take an ArrayList of cards
		// as input and then determine what evaluates to and
		// return that as a String
        //Prints hand type and updates winning
        //Close brackets take up their own line hence longer method 
        
        Collections.sort(hand);
        if(royalFlush(hand) == true) {//royal flush
            win = 250;//update win
            return "Royal Flush";
        }
        else if(straightFlush(hand) == true) {//straight flush
            win = 50;//update win
            return "Straight Flush";
        }
        else if(fourOfAKind(hand) == true) {//four of a kind 
            win = 25;//update win
            return "Four of kind";
        }
        else if(fullHouse(hand) == true) {//Fullhouse
            win = 6;//update win
            return "Full house";
        }
        else if(flush(hand) == true) {//flush
            win = 5;//update win
            return "Flush";
        }
        else if(straight(hand) == true) {//straight
            win = 4;//update win
            return "Straight";
        }
        else if(threeOfAKind(hand) == true) {//Three kind
            win = 3;//update win
            return "Three of a kind";
        }
        else if(twoPairs(hand) == true) {//two pair
            win = 2;//update win
            return "Two pairs";
        }
        else if(onePair(hand) == true) {//one pair
            win = 1;//update win
            return "One pair";
        }
        else //nothing won
        return "high card ";
    }
    
    public boolean royalFlush(ArrayList<Card> hand) { //checks RF
        for(int i = 0;i<5;i++) { //Checks same suite
            if((hand.get(i).getSuit() != hand.get(0).getSuit()))
                return false;
        }

        //If card 0 is ace and card 4 is king
        if(hand.get(0).getRank()==1 && hand.get(4).getRank()==13)
            //if card 1 is 10 and card 3 is queen
            if(hand.get(1).getRank()==10 && hand.get(3).getRank()==12)
                if(hand.get(2).getRank()==11)//if card 11 is jack
                    return true;
        return false;
    }
    //checks SF. Same suit+order
    public boolean straightFlush(ArrayList<Card> hand) {
        if(straight(hand) == true && flush(hand) == true)
            return true;
        else 
            return false;
        
    }

    public boolean fourOfAKind(ArrayList<Card> hand) { //Checks fourOfaKind
        //If first and 4th card are same rank
        if(hand.get(0).getRank()==hand.get(3).getRank()
          || hand.get(1).getRank()==hand.get(4).getRank())
            return true;
        
        else 
            return false;
        
    }


    public boolean fullHouse(ArrayList<Card> hand) { //3 same 1 pair

            //Check first two same
            if(hand.get(0).getRank()==hand.get(1).getRank()) {
                //Check next one same
                if(hand.get(2).getRank()==hand.get(0).getRank()) {
                    //if first 3 same, check next 2
                    if(hand.get(3).getRank()==hand.get(4).getRank())
                        return true;
                }
                //Check last 3 to be same
                else if (hand.get(2).getRank()==hand.get(3).getRank()
                    && hand.get(2).getRank()==hand.get(4).getRank())
                    return true;
            }
            return false;

    }

    public boolean flush(ArrayList<Card> hand) { //Same suites
        for(int i = 0;i<5;i++) //Repeats 5 times
            //Checks same suite
            if((hand.get(i).getSuit() != hand.get(0).getSuit()))
                return false;
        return true;
    }

    public boolean straight(ArrayList<Card> hand) { //in a row
       
        if(onePair(hand) == false) { //no pairs
            if(twoPairs(hand) == false) {
                //Check if ranks in a row
                if((hand.get(4).getRank()-hand.get(0).getRank()) == 4 )
                    return true;
                //If first is ace and last is king
                else if(hand.get(4).getRank() == 13){
                    if(hand.get(0).getRank() == 1 
                      && hand.get(4).getRank()-hand.get(1).getRank() == 3 ) 
                    return true;
                }
            }
            
        } 
        return false;
    }

    public boolean threeOfAKind(ArrayList<Card> hand) {
        if(hand.get(0).getRank()==hand.get(2).getRank() ||
         hand.get(2).getRank()==hand.get(4).getRank() ||
         hand.get(1).getRank()==hand.get(3).getRank())
            return true;
        else
            return false;
    }


    public boolean twoPairs(ArrayList<Card> hand) {
        int counter= 0;
        for(int i = 0; i<4;i++) { //repeat 4 times
            //If two consequitive cards have same rank and 
            if(hand.get(i).getRank() == hand.get(i+1).getRank()) {
                counter++;
            }
        }
        if(counter == 2)
            return true;
        else 
            return false;
            
    }

    public boolean onePair(ArrayList<Card> hand) {
        int counter= 0;
        for(int i = 0; i<4;i++) { //repeat 3 times
            if(hand.get(i).getRank() == hand.get(i+1).getRank()) {
                counter++;
            }
        }
        if(counter == 1)
            return true;
        else 
            return false;
    }
    
    
       /* 
        * Instructions provided:
        * 
        * 
        * TestHand constructor:
        * // This constructor is to help test your code.
		// use the contents of testHand to
		// make a hand for the player
		// use the following encoding for cards
		// c = clubs
		// d = diamonds
		// h = hearts
		// s = spades
		// 1-13 correspond to ace-king
		// example: s1 = ace of spades
		// example: testhand = {s1, s13, s12, s11, s10} = royal flush
		// 
		// you need to figure out what card to instantiate and then add it to the player hand using p.addHand(Card(testHand[i]))
		
        * 
        * Play:
        * /* 0. shuffle cards - 
         * 1. computer deals 5 cards
         * 5 times:
         *  deal a single card - how? - cards.deal() gives me a card
         *  add it to the players hand  p.addCard( put that card here)
         * 
         * 2. player chooses which cards to replace
         *   solicit input from the user. which cards to keep
         * 
         * 
         * 
         * 
         * 3. computer replaces specified cards
         *   use the remove and add methods on p to do this
         * 
         * 
         * 4. computer declares the hand type
         *   *this is the bison
         * 
         *    a) evaluate the hand -- so call checkHand
         * 
         * how do we access the hand?  checkhand(p.getHand())
         * 
         * 5. payout
        
        CheckHand:
		// 
		// first thing to do is sort the hand. how?
		// 
		// call each of the submethods(giving each of them access to the hand)
		// 
		
        sort the hand
            how do we do this?
            Collections.sort(hand or p.getHand())
            
            get the hand, then sort it
      
            2s,2h,4d,5h,6s
            
        evaluate the hand
            call helper methods for each hand in descending order
        return the string
        
       Here are the hands in descending order:
         * royal flush - 
                             
         * straight flush  -  
         * 4 of a kind int first=hand.get(0).getRank()
         * full house
         * flush
         * straight  
         * 3 of a kind
         * two pair
         * 1 pair                 2c,2s,3c,4c,5c    2c,2s,2d,3c,4c
         * nothing (high card)
        
        */
        
        
		
}
	
    


