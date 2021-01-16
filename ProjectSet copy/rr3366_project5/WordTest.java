//*************************************
//
//  WordTest.java
//
//  Test class for WordLists.java
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Rutvik Rau
//  Your Uni: rr3366
//**************************************
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Collection;
import java.io.*;


public class WordTest{
    
    public static void main(String[] args) { 
        try{
            //Create word list object
            WordLists wordlist = new WordLists("dictionary.txt");

            //Writer to store array list for LengthN
            PrintWriter lengthn = new PrintWriter("lengthN.txt");
            //For each string in the list
            for(String eg : wordlist.lengthN(5)) {
                //Print string to output
                lengthn.println(eg);
            }
            //close file
            lengthn.close();

            //Writer to store array list for endswith
            PrintWriter endswith = new PrintWriter("endswith.txt");
            //For each string in the list

          for(String eg1 : wordlist.endsWith('a',5)) {
                //Print string to output
                endswith.println(eg1);
            }
            //close file
            endswith.close();

            
            //Writer to store array list for containsletter
            PrintWriter containsletter = new PrintWriter("containsletter.txt");
            //For each string in the list
            for(String eg : wordlist.containsLetter('a', 2, 3)) {
                //Print string to output
                containsletter.println(eg);
            }
            //close file
            containsletter.close();
    
            //Writer to store array list for multiletter
            PrintWriter multiletter = new PrintWriter("multiletter.txt");
            //For each string in the list
            for(String eg : wordlist.multiLetter(2,'a')) {
                //Print string to output
                multiletter.println(eg);
            }
            //close file
            multiletter.close();
        
        }
        catch (FileNotFoundException e) //file not found
        {
            System.out.println("dictionary.txt not found");
        }
        catch (IllegalArgumentException e) //illegal arguments
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e) //blanket case
        {
            System.out.println("Oops try again");
        }
    }
    

} // end of class








