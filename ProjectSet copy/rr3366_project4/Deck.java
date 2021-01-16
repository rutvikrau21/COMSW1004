/*
 * A 52 card deck to work with the rest of the classes
 * Creates deck, shuffles and deals cards
 * UNI: rr3366
 * Name: Rutvik Rau
 * 
*/
import java.util.Arrays;
import java.util.*;
import java.util.Collection;

public class Deck {
	
	private Card[] cards;
	private int top; //the index of the top of the deck

	//add more instance variables if needed
	
	public Deck(){
        cards = new Card[52];
        //Make a 52 card deck 
        top = 0;
        int counter = 0;
		for (int i = 1; i<5; i++) { //Loops through suits
            for (int j = 1; j<14; j++) { //Loops through numbers
                cards[counter] = new Card(i,j);//Creates a card & adds to deck
                counter++;
            }
        }
	}
	
	public void shuffle(){ //Shuffles created deck
        //https://www.javatpoint.com/java-collections-shuffle-method
        Collections.shuffle(Arrays.asList(cards));//shuffles deck
	}
	
	public Card deal(){
		//If top card in deck range
        if(top<52) {
            top++;
            return cards[top-1];//return current top
        }
        else {
            shuffle();//if deck is over
            top = 1;
            return cards[top-1];
        }
            
	}
    
    public void reset(){ //restart deck and. shuffle
        top = 0;
        shuffle();
    }
    
    
}
