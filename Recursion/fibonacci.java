package Recursion;

public class fibonacci {
    public static int Fibo(int n ){
        if(n== 0 || n == 1){
            return n;
        }
        
        int fibnm1 = Fibo(n-1);
        int fibnm2 = Fibo(n-2);
        int fibn = fibnm1 +fibnm2; // universal eqn
        return fibn;

    }
    public static void main(String[] args) {
        System.out.println(Fibo(25));
    }      
    
}
