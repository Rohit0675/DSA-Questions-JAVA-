package Bit_Manipulation;

public class FastExponentiation {
    public static int Exp(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!= 0){
                ans= ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Exp(5, 10000));
    }
    
}
