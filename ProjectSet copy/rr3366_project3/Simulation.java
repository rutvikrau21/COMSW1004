/**
 * This class should run simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not who has the advantage and what is a strategy
 * that will realize that adavantage.
 * 
 * @UNI: rr3366
 * @Name: Rutvik Rau
 */


public class Simulation{
    
    public static void main(String[] args){
        //int variables needed;
        int small_amt = Integer.MAX_VALUE; 
        int largest_small_amt = Integer.MIN_VALUE; 
        double t1 = 0.0;//Threshold to be saved
        final double GAMES_PLYD = 100000.0;// Games played
        
        // loops through values of t1
        for (double i = 0; i<1; i+=0.02) {
            
            small_amt = Integer.MAX_VALUE;
            
            //loops through values of t2
            for (double k = 0.0; k<1; k+=0.02) {
                
                Game gp1 = new Game(i,k); //instantiate game class for player 1
                gp1.play((int)GAMES_PLYD);
                
                //Checks if score at t is smaller than small_amt
                if (gp1.getP1Score() < small_amt){
                    small_amt = gp1.getP1Score();
                }
                 
            }
            
          
            //Checks if small_amt greater than largest_small_amt
            if (small_amt > largest_small_amt) {
                largest_small_amt = small_amt;
                //Saving threshold
                t1 = i;
            }
         
         
        }
            System.out.println("P1 has an unfair advantage at t* " + t1);
            System.out.println("The average winnings for p1 is " + (double)largest_small_amt / GAMES_PLYD);
            
        }
    
          
}