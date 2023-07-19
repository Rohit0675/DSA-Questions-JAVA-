package Recursion;



public class x_power_n {
    public static double Power(double x, double n){
        if(n == 1){
            return x;
        }

        double xpnm1 = Power(x, n-1);
        double xpn = x*xpnm1;
        return xpn;
    }
    public static void main(String[] args) {
        System.out.println(Power(10, 100));
        
    }
    
}
