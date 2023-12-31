package Functions;
import java.util.*;
public class functionPalindrome {
    public static void main(String[] args) {
        System.out.print("Please Enter a number :");
        Scanner sc= new Scanner(System.in);
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)){
            System.out.println("Number: "+palindrome+ " is a Palindrome");
        }
        else{
            System.out.println("Number: "+palindrome+ " is not a Palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(int n){
        int palindrome = n;
        int rev = 0;

        while(palindrome!=0){
            int rem = palindrome%10;
            rev = rev *10 + rem;
            palindrome = palindrome/10;
        }

        if(n == rev){
            return true;
        }
        else{
            return false;
        }
    }
    
}
