/**
 * This class represents a computer
 * player in the Odd-Even game
 * 
 * @UNI: rr3366
 * @Name: Rutvik Rau
 * @author Rau and Cannon
 */
import java.lang.*;

public class Player{
    //variables
    private double t;
    private int score;
    private int choice;
    
    public Player(double threshold){
        //initialise variables
        t=threshold;
        score=0;
    }
    //Generates value for comp
    public int choice() {
        //comp chooses a number
        double x = Math.random();
        if (x<t)
            return 1;//chooses 1
        else
            return 2;//chooses 2
        
    }
    
    public void upScore(int x) {
        score+=x;//Add score
    }
    
    public void dwScore(int x) {
        score-=x;//Decrease score
    }
   
    public int getScore() {
        return score;
    }
    
    
}