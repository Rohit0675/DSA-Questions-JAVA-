package Recursion;



public class x_power_n_optimized {
    public static int Power(int a, int n){
        if(n == 0){
            return 1;
        }
        int x = Power(a, n/2);
        int halfPowersq = x*x;
        // n is odd
    if(n%2 != 0){
        halfPowersq = a* halfPowersq;
    }

    return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(Power(2, 10));
        
    }
}
