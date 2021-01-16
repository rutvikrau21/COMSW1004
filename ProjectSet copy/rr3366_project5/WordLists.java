//*************************************
//
//  WordLists.java
//
//  Class to aid with Scrabble
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Rutvik 
//  Your Uni: Rau
//**************************************

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Collection;
import java.io.*;


public class WordLists{
    //Instance variables
    private File inFile;
    private Scanner input;
    

    public WordLists(String fileName) throws FileNotFoundException {
        
        inFile = new File(fileName);//create file
        input = new Scanner(inFile);//create scanner
    }


    public ArrayList<String> lengthN(int n) throws FileNotFoundException {
        if(n<1) //Check if positive number throw exception
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Positive int's only"); 
        input = new Scanner(inFile); //Create scanner
        ArrayList<String> list = new ArrayList<String>(); //create list
        while(input.hasNext()) { //file not over
            String word = input.nextLine(); //save word
            if(word.length() == n) { //check for length
                list.add(word); //add string
            }
        }
        return list; //return list
    }


    public ArrayList<String> endsWith(char lastLetter, int n) 
        throws FileNotFoundException {
        if(Character.isLetter(lastLetter) == false) //if char is letter 
            throw new IllegalArgumentException("Illegal Argument: Enter a " 
                                               +" letter"); //exception
        if(n<1) //if positive number throw exception
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Positive int's only"); 
        input = new Scanner(inFile); //create scanner
        ArrayList<String> list1 = new ArrayList<String>(); //create list
        while(input.hasNext()) { //file not over
            String word = input.nextLine(); //save word
            if(word.length() == n) { //check length
                if(lastLetter == word.charAt(n-1)) { //check last char
                    list1.add(word); //add string
                }
                    
            }
        }
        return list1; //return list
    }


    public ArrayList<String> containsLetter(char included, int index, int n) 
        throws FileNotFoundException {
        if(Character.isLetter(included) == false)//if char is letter
            throw new IllegalArgumentException("Illegal Argument: Enter a " +
                                               "letter"); 
        if(n<1) //if postitve number throw exception
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Positive int's only");
        if(index<1) //if postitve number throw exception
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Positive int's only");
        if(index>=n) //index greater than length throw exception
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Index less than length"); 
        
        input = new Scanner(inFile); //create scanner
        ArrayList<String> list2 = new ArrayList<String>();
        while(input.hasNext()) { //if file not over
            String word = input.nextLine(); { //save word
                if(word.length() == n) { //check length
                    if(word.charAt(index) == included) { //check char at index 
                        list2.add(word); //add string
                    }
                        
                }
                
            }
        }
        return list2; //return list
    }

 
    public ArrayList<String> multiLetter(int m, char included) 
        throws FileNotFoundException {
        if(Character.isLetter(included) == false) //if char is letter
            throw new IllegalArgumentException("Illegal Argument: Enter a " +
                                               "letter"); //exception
        if(m<1) //positive int
            throw new IllegalArgumentException("Illegal Argument: "
                                               +"Positive int's only");
        input = new Scanner(inFile); //create scanner
        ArrayList<String> list3 = new ArrayList<String>(); //create list
        int counter = 0; //counter
        while(input.hasNext()) { //if file not over
            String word = input.nextLine(); //save string
            for(int i = 0; i<word.length(); i++) { //for each char in word
                if(word.charAt(i) == included) { //check if included
                    counter++; //add counter
                }
            }
            if(counter == m) { //if counter equals m
                list3.add(word); //add string
            }
            counter = 0; //reset counter
        }
        return list3; //return list
    }
    

} 








