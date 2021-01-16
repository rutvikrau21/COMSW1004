/* 
 * This is the RangeInput test class
 * Your code for problem 3.3 must work with this
 * You should not change this class
 * 
 * 
 */

public class RangeInputTester{
    
    public static void main(String[] args){
        RangeInput myInput = new RangeInput(30,20);
        System.out.println("current value: " + myInput.getCurrentValue());
        for (int i=0;i<4;i++){
            myInput.up();
        }
        System.out.println("new value: " + myInput.getCurrentValue());
        
        for (int i=0;i<50;i++){
            myInput.down();
        }
        System.out.println("last value: " + myInput.getCurrentValue());
    }
    
    
}