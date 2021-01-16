import java.util.Scanner;
import java.lang.String;
public class E63a{
    
    public static void main(String[] args){
       
        System.out.println("Enter your desired string");
        // Input new string
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        // Loop through all characters of the string
        for( int i = 0; i < x.length(); i++){
            if( Character.isUpperCase(x.charAt(i))){
                //Page 390: Chapter 11
                //Page 125: Chapter 4
                System.out.println(x.charAt(i));
            } 
        }
    }
}