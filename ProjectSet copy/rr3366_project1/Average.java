/**
 * This program determines the average of a list of numbers.
 * 
 * @author: Rutvik Rau
 * @date: 9/24/2020
 */
import java.util.Scanner;
public class Average{
    
    public static void main(String[] args){
        
    // Values needed
    int i = 0;
    double Total = 0;
    double val = 0;
    // Begin while loops
    while(true){
      System.out.println("Enter an element ");
      Scanner no = new Scanner(System.in);
      val = no.nextInt();
      // Determine if N is -1
      if(val == -1){
        break;
      }
      Total = Total + val;
      i++;
      }
     //System.out.println("Sum is " + Total);
     if (i == 0){
       i = 1;
       System.out.println("Average is " + (Total/i));
     }
    }
}
 