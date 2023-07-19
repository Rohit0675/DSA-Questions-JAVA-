import java.util.*;
public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n==2){
            System.out.println(n+ " is Prime Number");

        }else{
            boolean isPrime = true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){ //n is a multiple of i(i is not equal to 1 or n)
                    isPrime = false;
    
                }
            }
            if(isPrime==true){
                System.out.println(n+ " is Prime Number");
              }else{
                System.out.println(n+" is non-prime number");
              }
            }
            sc.close();

        }

       
    
    
}
