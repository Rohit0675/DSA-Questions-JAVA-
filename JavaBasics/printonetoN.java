import java.util.*;
public class printonetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int number = sc.nextInt();
        int count = 1;
        while(count<=number){
            System.out.print(count+" ");
            count++;

        }
        sc.close();

        
    }
    
}
