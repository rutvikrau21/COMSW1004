import java.util.Scanner;
import java.lang.String;
public class E63b{
    public static void main(String[] args){
        // Input string
        System.out.println("Enter your desired string");
        Scanner input = new Scanner(System.in);
        // Loop through all alternate characters
        String x = input.nextLine();
        for( int i = 0; i < x.length(); i = i + 2){
            System.out.println(x.charAt(i));
        }
        

    }
}