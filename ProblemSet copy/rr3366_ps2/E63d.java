import java.util.Scanner;
import java.lang.String;
public class E63d{
    public static void main(String[] args){
        System.out.println("Enter your desired string");
        // Input string
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int l = 0;
//Loop through all characters
        for(int i = 0; i < x.length(); i++){
            char k = x.charAt(i);
            //Check if character is a voewel, upper or lower case
            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
                l++;
        }
        System.out.println("Number of vowels is " + l);
            
     }
}