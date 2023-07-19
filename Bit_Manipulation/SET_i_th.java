package Bit_Manipulation;
//convert bit to 11
public class SET_i_th {
    public static void i_thBit(int num, int i){
        int bitMask = 1<<i;
        
        System.out.println(num|bitMask);
        }
        public static void main(String[] args) {
            int num =10;
            i_thBit(num, 2);
        
    }
    }
    
   

