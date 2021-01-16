/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: Rutvik Rau
 * @date: 9/24/2020
 */

import java.util.Scanner;

public class Easter{
  
    public static void main(String[] args){

      // Get and store inputs
      System.out.println("Enter a year in yyyy format");
      Scanner input = new Scanner(System.in);
      int y = input.nextInt();
      // Calculate value
      int a = y%19;
      int b = y/100;
      int c = y%100;
      int d = b/4;
      int e = b%4;
      int g = (8 * b + 13)/25;
      int h = (19 * a + b - d - g + 15)%30;
      int j = c/4;
      int k = c%4;
      int m = (a + 11 * h)/319;
      int r = (2 * e + 2 * j - k - h + m + 32)%7;
      int n = (h - m + r + 90)/25;
      int p = (h - m + r + n + 19)%32;
      //Print easter date in mm/dd/yyyy format
      System.out.println("Easter is on " + n + "/" + p + "/" + y);
      

    }





}	
