package Recursion;

public class factorial {
    public static double fact(double n){
        if(n == 0){
            return 1;
        }
        double fnm1 = fact(n-1);
        double fn = n* fnm1;
        return fn;

    }
    public static void main(String[] args) {
        System.out.println(fact(100));
    }
    
}
