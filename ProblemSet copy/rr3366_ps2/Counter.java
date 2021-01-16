/* 
 * This is the Counter class that you have to create
 * for problem E3.2
 * 
 * 
 */

public class Counter{
    
    private int value;
    private int maxValue;
    
    public Counter(){
     value = 0;
     //https://www.tutorialspoint.com/java/lang/java_lang_integer.htm#:~:text=s
     //tatic%20int%20MAX_VALUE%20%E2%88%92%20This%20is,can%20have%2C%20%2D231 
     //Set number to infinity 
     maxValue = Integer.MAX_VALUE;
   
    }
    
    public void click(){
        // this is the mutator method
        // used to click the counter
        value++;
        value = Math.min(value, maxValue);
    }
    
//How to ensure first click also counts
    
    public int getValue(){
        // this is the accessor method for value
        // you do not need to change this method
        return value;
    }
    
    public void setLimit(int maximum ){
        // this is the setLimit method. 
        maxValue = maximum;
        
    }
    
}