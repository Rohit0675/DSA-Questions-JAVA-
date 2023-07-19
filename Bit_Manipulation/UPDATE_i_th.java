package Bit_Manipulation;

public class UPDATE_i_th {
    public static int set_i_thBit(int num, int i){
        int bitMask = 1<<i;
        return num|bitMask;
        
        }
    public static int clear_i_thBit(int num, int i){
        int bitMask = ~(1<<i);
        return num&bitMask;
        
        }

    public static int update_i_thBit(int num, int i, int newBit){
        if(newBit == 0){
            return clear_i_thBit(num, i);
        }else{
            return set_i_thBit(num, i);
        }
        


        }
        public static void main(String[] args) {
         System.out.println(update_i_thBit(10, 2, 1));
        
    }
    
    
}
