package Functions;
import java.util.*;
public class functionInput {

    public static void Sum(int a, int b){// parameters or formal parameters
        int sum = a+b;
        System.out.println(sum);

    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        Sum(a,b); // actual parameters or arguments
        sc.close();
    }

   
    
}
