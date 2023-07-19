package Bit_Manipulation;



public class ClearRangeOfBits {
    public static int Clear(int num, int i, int j){
        int a = (~0)<<(j+1);
        int b = (i<<i)-1;
        int bitMask = a|b;
        return num&bitMask;

    }
    public static void main(String[] args) {
        System.out.println(Clear(10, 2, 4));
    }
    
}
