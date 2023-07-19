package Bit_Manipulation;

public class GET_i_th {
    public static void i_thBit(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            System.out.println("i-th bit is 0");
            }else{
                System.out.println("i-th bit is 1");
            }
        }
        
    
    public static void main(String[] args) {
        int num =14;
        i_thBit(num, 5);

        
    }
    
}
