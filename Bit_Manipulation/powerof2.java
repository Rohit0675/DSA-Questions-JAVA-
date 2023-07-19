package Bit_Manipulation;

public class powerof2 {
    public static boolean Power(int num){
        if((num&(num-1))==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(Power(15));
    }
    
}
