import java.util.*;
public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double number = sc.nextDouble();

        if (number < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        sc.close();
    }
   
    
}
