
package Array;
// import java.util.*;
public class largestNum {
    public static int Largest(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i =0;i < num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,7,3,5};
        System.out.println("Largest value is: "+ Largest(num));
    }

    
}
