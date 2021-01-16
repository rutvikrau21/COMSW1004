import java.util.Scanner;
import java.lang.String;
public class E63e{
    public static void main(String[] args){
        System.out.println("Enter your desired string");
        //Input a string
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int l = 0;

        for(int i = 0; i < x.length(); i++){
            char k = x.charAt(i);
            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U')
                System.out.println("Position of vowel " + k + " is " + i);
        }
            
     }
}