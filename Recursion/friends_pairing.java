package Recursion;

public class friends_pairing {
    public static int Pair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // single
        int fnm1 =  Pair(n-1);
        // pair
        int fnm2 = Pair(n-2);
        int pairWays = (n-1)*fnm2;
        // total
        int total = fnm1 + pairWays;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(Pair(3));
    }
    
}
