/**
 * This program converts a number of hours, days, and weeks into minutes.
 * 
 * @author: Rutvik Rau
 * @date: 9/24/2020
 */

import java.util.Scanner; 
public class Minutes{
    
    public static void main(String[] args){
        
        //Create scanner for hours 
        Scanner hours = new Scanner(System.in);
        System.out.println("Enter number of hours");
        int hrs = hours.nextInt();
        int m_hrs = (hrs *60);
      
        //Create scanner for days
        //Calculate minutes for days entered
        Scanner days = new Scanner(System.in);
        System.out.println("Enter number of days");
        int dys = days.nextInt();
        int m_dys = (dys * 24 * 60);
      
        //Create scanner for weeks
        //Calculate minutes for weeks entered
        Scanner weeks = new Scanner(System.in);
        System.out.println("Enter number of weeks");
        int wk = days.nextInt();
        int m_wk = (wk * 24 * 60 * 7);
      
        //Print
        System.out.println("Total number of minutes is " + (m_wk + m_dys + m_hrs));
        
    }
}
 