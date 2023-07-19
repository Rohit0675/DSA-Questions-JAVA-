import java.util.*;
public class conditional {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Number is: ");
       int A = sc.nextInt();

        if (A%2 == 0){
            System.out.println("No. is  Even");
        }  else{
            System.out.println("No. is odd");
        }
        sc.close();
    }
}
