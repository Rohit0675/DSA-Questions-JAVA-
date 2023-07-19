package ArrayList;
import java.util.*;
public class pracQue1 {

    public static boolean monotone(ArrayList <Integer> list){

        for(int i = 0; i<list.size(); i++){
            if(list.get(i)<list.get(i+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(monotone(list));
    }
    
}
