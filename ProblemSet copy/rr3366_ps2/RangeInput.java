/* 
 * This is the RangeInput class that you have to create
 * for problem E3.3
 * 
 * 
 */

public class RangeInput{
    
    private int currentValue;
    private int highValue;
    private int lowValue;
    
     public RangeInput(int high, int low){
        // this is the constructor
        highValue = high;
        lowValue = low;
        currentValue = (high + low)/2;
        
    }
    
    public void up(){
        // this is a mutator method
        // that increases currentValue if allowed
        
            currentValue++;
            currentValue = Math.min(currentValue, highValue);
     
    }
    
    public void down(){
        // this is a mutator method
        // that decreases currentValue if allowed
            currentValue--;
            currentValue = Math.max(currentValue, lowValue);
       
    }
    
    public int getCurrentValue(){
        // this is an accessor method 
        return currentValue;
        
    }
    
    
    
}