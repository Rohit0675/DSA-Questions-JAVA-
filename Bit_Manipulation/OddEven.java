package Bit_Manipulation;

public class OddEven {
    public static void odd_even(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        }
        
    
    public static void main(String[] args) {
        int num = 1999;
        odd_even(num);
    }
    
}
