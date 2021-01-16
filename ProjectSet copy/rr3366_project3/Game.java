/**
 * This class represents the Odd-Even game
 * Includes for a game initialised with no parameters 
 * or with parameters
 * 
 * @UNI: rr3366
 * @Name: Rutvik Rau
 * and @author Cannon
 */
import java.util.Scanner;

public class Game{
    //Variables
    private Player p1; 
    private Player p2; 
    private Scanner input;
    private int score;
    private int sum;
    private int p1_choice;
    private int p2_choice;
    private int cont;
    
    
    
    
/* this version of the game constructor is for Part 1
 * it takes no parameters */
    public Game(){
        //Creates one comp player
        //Sets instance values as needed
        p2 = new Player(0.5);
        input = new Scanner(System.in);
        score = 0;
        sum = 0;
        cont = 1;
    }
    
/* this version of the game constructor is for Part 2
 * It requires two doubles as parameters. You will use 
 * these to set the initial thresholds for you computer players */
    public Game (double t1, double t2){
        //Creates two players
        
        p1 = new Player(t1);
        p2 = new Player(t2);
        sum = 0;
        }
    
    
/* this version of the play method is for Part 1
 * It takes no parameters and should play one interactive
 * version of the game */
//    Asks player1 to choose 1 or 2
//    generates a value for p2
//    Finds sum with that value
//    Checks who wins based on the sum
    public void play(){
        while (cont == 1) { //to ensure player can play again
        System.out.println("You are player 1, you win if the sum is odd");
        System.out.println("Choose 1 or 2");
        p1_choice = input.nextInt();
        p2_choice = p2.choice();
        sum = p1_choice+p2_choice;//Sum of the choices from user and comp
        if (sum == 3)//If player wins
            System.out.println("Player 1 wins " + sum + " tokens");
        if (sum == 2| sum == 4)//If comp wins
            System.out.println("Player 2 wins " + sum + " tokens"); 
         System.out.println("Press 1 to play again or 0 to quit game");
         cont = input.nextInt();//Save response of user
        }
    }
/** this version of the play method is for Part 2
 * It takes a single int as a parameter which is the
 * number of computer vs. computer games that should be played */
//     Repeats the game for "games" times
//     Generates choice for p1 and p2
//     finds sum and checks who wins based on sun
    public void play(int games){
        for (int i = 0; i<games; i++) { //repreat "games" times
            p1_choice = p1.choice();//choice of comp1
            p2_choice = p2.choice();//choice of comp2
            sum = p1_choice+p2_choice;
            if (sum == 3) { //if comp1 wins
                p1.upScore(sum);
                p2.dwScore(sum);
            }
            if (sum == 2| sum == 4) { //if comp2 wins
                p2.upScore(sum);
                p1.dwScore(sum);
            }
        }
    }
    
/* this method should return the current score (number of tokens)
 * that player 1 has */
    public int getP1Score(){
        
        return p1.getScore();
    }
    
/* this method should return the current score (number of tokens)
 * that player 2 has */
    public int getP2Score(){
        
        return p2.getScore();
    }  
    
    
   
}