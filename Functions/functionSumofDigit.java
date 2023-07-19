package Functions;
import java.util.*;
public class functionSumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Sum: "+ sumDigits(number));
        sc.close();
    }

    public static int sumDigits(int n){
        int sum = 0;
        while (n >0){
            int lastdigit = n%10;
            sum += lastdigit;
            n /=10;
        }
        return sum;
    }
    
}
