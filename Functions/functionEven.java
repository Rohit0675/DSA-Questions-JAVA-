package Functions;
import java.util.*;
public class functionEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        
        
        if(isEven(num)){
            System.out.println("Number is Even");

        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}

