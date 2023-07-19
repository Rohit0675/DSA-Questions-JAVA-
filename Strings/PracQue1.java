package Strings;
import java.util.*;


public class PracQue1 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
       String str = new Scanner(System.in).nextLine();
       int count = 0;
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'  ){
                count++;
            }
        }
        System.out.println("Count of vowels is "+ count);
        
        
    }
   
}
