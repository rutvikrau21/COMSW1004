/**
* ArrayMethods - Manipulate Array Contents
* 
* COMS W1004
* 
* Rutvik Rau 
* Uni: rr3366
* Manipulates arrays as mentioned by methods below
* 
*/

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayMethods {

	// private instance variables
	private int[] values;
	// this is for  resetting purposes, otherwise not needed
	private int[] originalValues; 

	//constructor
	public ArrayMethods(int[] initialValues) {
		values = initialValues;
		originalValues = Arrays.copyOf(values, values.length);
	}

	// pretty printing for testing purposes
	public void printArray() {
		for (int i : values) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	// resetting back to original values for testing purposes
	public void resetValues() {
		values = Arrays.copyOf(originalValues, originalValues.length);
	}

	// a. swap the first and last elements
	public void swapFirstAndLast() {
		int temp = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = temp;
	}

	// b. shift all element to right and wraparound
	public void shiftRight() {
		int temp = values[values.length-1];
        for (int i = values.length-1; i>0; i--) 
            values[i] = values[i - 1];
        values[0] = temp;
	}

	// c. replace even elements with zero
	public void replaceEven() {
		for (int i = 0; i<values.length-1;i++){
            if ((values[i] % 2) == 0)
                values[i] = 0;
        }
	}

            
	// d. replace middle elements with larger of two neighbors
	public void replaceMiddle() {
       
        for(int i = 1; i<values.length-1; i++)
            values[i] = Math.max(originalValues[i-1], originalValues[i+1]);
        
	}

	// e. Remove middle one or two elements
	public void removeMiddle() {
        int mdl = values.length/2;
        if((values.length%2) != 0){ //If odd
            for (int i = mdl; i<values.length-1; i++)
                values[i] = values[i+1];
            int[] temp = Arrays.copyOf(values, values.length-1);
            values = Arrays.copyOf(temp, temp.length);
        }
        else { // if even
            values[mdl-1] = originalValues[mdl+1];
            values[mdl] = originalValues[mdl+2];
            values[mdl+1] = values[values.length-1];
            int[] temp = Arrays.copyOf(values, values.length-2);
            values = Arrays.copyOf(temp, temp.length);
        }
	}

	// f. Move even elements to the front
	public void moveEven() {
        /*
        for (int i = 0; i<values.length-1;i++) {
            for (int j = 0; j<values.length-2;j++) {
                if (values[j]+values[j+1]%2 == 0)
                    break;
                else {
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
                    
                    
            }
        }
        */
        int[] temp = new int[values.length];
        int counter = 0;
        for (int i = 0; i<values.length; i++) {
            if (values[i]%2 == 0) { //If even
                temp[counter] = values[i];
                counter++;
            }
        }
        for (int i = 0; i<values.length; i++) {
            if (values[i]%2 != 0) { //If odd
                temp[counter] = values[i];
                counter++;
            }
        }
        values = Arrays.copyOf(temp, temp.length);
        
	}

	// g. Return second-largest element
	public int secondLargest() {
        int second_largest = 0;
		Arrays.sort(values);
        for (int i = values.length-1; i>0;i--) {
            if(values[i-1]!=values[i])
                second_largest = values[i-1];
                break;
        }
        return second_largest;
	}

	// h. Check if sorted in increasing order
	public boolean sortedIncreasing() {
        boolean checker = false; 
        Arrays.sort(values);
        int temp[] = Arrays.copyOf(values, values.length);
        if(Arrays.equals(temp, originalValues) == true)
            checker = true;
        return checker;



	}

	// i. Check if contains two adjacent duplicate elements
	public boolean adjacentDups() {
        boolean checker = false;
		for(int i = 1; i<values.length-1;i++)
            if(values[i] == values[i-1])
                checker = true;
            else
                checker = false;
            return checker;
        





	}

	// j. Check if contains any duplicate elements
	public boolean containsDups() {
		// O(n^2)
		// your code here
        boolean checker = false;
        for (int i = 0; i<values.length-1;i++) {
            for (int j = i+1; i<values.length-1;i++){
                if(values[i] == values[j])
                checker = true;
                break;
                
            }
        }
        return checker;





	}



}