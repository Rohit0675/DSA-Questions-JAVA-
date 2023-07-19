import java.util.*;
public class sumoffirstNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=number){
           sum+=count;
           count++;
        }
        System.out.print(sum+" ");
        sc.close();
    }
    
}
