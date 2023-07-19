package ArrayList;
import java.util.*;
public class pairsum1 {
    public static boolean Pairs(ArrayList <Integer> list, int  target){
        for(int i = 0; i<list.size();i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
           
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Pairs(list, 2));

    }
    
}
