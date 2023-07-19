package Stacks;
import java.util.*;
public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};

        Stack<Integer> s = new Stack<>();
        int NextGreater[] = new int[arr.length];
        //next Greater right 
        for(int i = arr.length-1; i>=0; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //if-else
            if(s.isEmpty()){
                NextGreater[i] = -1;
            }else{
                NextGreater[i] = arr[s.peek()];
            }

            //push in stack
            s.push(i);
        }
        for(int i =0; i<NextGreater.length; i++){
            System.out.print(NextGreater[i]+ " ");
        }
        System.out.println();
    }
}
    //next Greater left - just change the loop  
    //next Smaller right - change th conditiion in while
    //next smaller left - change th conditiion in while & change the loop  