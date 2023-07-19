package Bit_Manipulation;

public class Clearlast_i {
    public static int Clear(int num, int i){
        //because ~0 = -1 and -1 = 11111111
        int bitMask = (~0)<<i;
        return num&bitMask;

}

    public static void main(String[] args) {
       System.out.println( Clear(15, 2));
    }
    
}
