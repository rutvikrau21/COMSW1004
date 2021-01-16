/*
 * A card creater to work with the rest of the classes
 * Creates a card, compares it and converts data to string cards
 * UNI: rr3366
 * Name: Rutvik Rau
 * 
*/

public class Card implements Comparable<Card>{
	
	private int suit; //use integers 1-4 to encode the suit in CDHS
	private int rank; //use integers 1-14 to encode the rank
	
	public Card(int s, int r){
		suit = s;
        rank = r;
	}
  
	public int compareTo(Card c){
		//use this method to compare cards so they 
		//may be easily sorted
        //Compare based on rank 
        //Break tie based on suits
        if(rank > c.rank){ //compare by ranks of cards
            return 1; 
        }
        
        else if (rank == c.rank) {//if same rank
            if(suit == c.suit)//if same suit
                return 0;
            else if(suit < c.suit)//if suit is smaller
                return -1;
            else if(suit > c.suit )//if suit is larger
                return 1;
        }
        return -1;
        

	}
    public String suits(){
        String suits = "";
        if(suit == 1) //clubs
            suits = "C ";
        if(suit == 2) //diamonds
            suits = "D ";
        if(suit == 3) //hearts
            suits = "H ";
        if(suit == 4) //spades
            suits = "S ";
        return suits;
    }
    
    public String ranks() {
        String ranks = "";
        if(rank == 1)//if rank 1
            ranks = "Ace";
        if(rank == 11)//if rank 11
            ranks = "Jack";
        if(rank == 12)//if rank 12
            ranks = "Queen";
        if(rank == 13)//if rank 13
            ranks = "King";
        return ranks;
        }
    
	public String toString(){
        //IF ace, jack, queen or king
        if (rank == 1||rank == 11||rank == 12||rank == 13)
            return (suits() + ranks()); 
        else //if numbers
            return (suits() + rank);
                
    }
              
	
    public int getSuit() { //Return suit
        return suit;
    }
    public int getRank() { //Return rank
        return rank;
    }

}


