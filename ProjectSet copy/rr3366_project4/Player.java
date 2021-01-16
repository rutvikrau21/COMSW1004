/*
Rutvik Rau
Uni: rr3366
Creates a player class to be used by game
Creates a hand for the user, bet amount and bankroll
Restarts hand to play again 
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Collection;

public class Player {
	
		
	private ArrayList<Card> hand; //the player's cards
	private double bankroll;
    private double bet;

	//you may choose to use more instance variables
		
	public Player(){		
	    bankroll = 100.0;//set initial balance
        hand = new ArrayList<Card>(); //Instantiates hand
	}

	public void addCard(Card c){
     
	   hand.add(c);//add current card to hand
	}

	public void removeCard(Card c){
	    hand.remove(c); //remove card from hand
        }
		
    public void bets(double amt){
        bet = amt; //save amount bet
        bankroll-=amt;//reduce bankroll
    }

    public void winnings(double odds){
        //add winnings/losses to bankroll
        bankroll = bankroll + (bet*odds);
            
    }

    public double getBankroll(){//returns bankroll
        return bankroll;
    }
    

    public double getBet() {//Returns bet
        return bet;
    }
    
    public ArrayList<Card> getHand() {//Returns hand
        return hand;
        
    }
    
    public Card getCard(int i) {//returns a card in hand
        return hand.get(i);
    }
    
    public int sizeHand() {//returns size of hand
        return hand.size();
    }
    
    public void sortHand(ArrayList<Card> hand) {//sorts hand
        Collections.sort(hand);
    }
    
    public void reset(){
        //restart hand
        hand.clear();
    }
        
    
    
    
    
    
}


