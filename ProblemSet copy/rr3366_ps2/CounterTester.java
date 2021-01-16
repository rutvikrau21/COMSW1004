/* 
 * This is the Counter test class
 * Your code for problem 3.2 must work with this
 * You should not change this class
 * 
 * 
 */

public class CounterTester{
    
    public static void main(String[] args){
        Counter myCounter = new Counter();
        myCounter.click();
        myCounter.click();
        System.out.println("current value: " + myCounter.getValue());
        
        myCounter.setLimit(3);
        myCounter.click();
        myCounter.click();
        System.out.println("new value: " + myCounter.getValue());
    }
    
    
}