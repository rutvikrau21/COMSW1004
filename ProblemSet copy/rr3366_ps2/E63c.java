import java.util.Scanner;
import java.lang.String;
public class E63c{
    public static void main(String[] args){
        System.out.println("Enter your desired string");
        // Input string
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        //ReplaceAll() function from: https://javarevisited.blogspot.com/2017/
        //01/string-replaceall-example-how-to-replace-all-characters-and-subs
        //tring.html
        String y = x.replaceAll("a|A|e|E|I|i|O|o|U|u", "_") ;
        System.out.println(y);
  }
}