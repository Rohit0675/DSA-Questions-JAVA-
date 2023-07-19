package ArrayList;

import java.util.*;;
public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //System.out.println(list);
        list2.add(true);
        //System.out.println(list2);
        list3.add("Rohit");
        //System.out.println(list3);
        //get operation
        //System.out.println(list.get(1));

        //remove operation
        //list.remove(2);
        //System.out.println(list);

        //set operation
        list.set(2, 11);
        //System.out.println(list);
        //contains operation
        //System.out.println(list.contains(13));
        System.out.println(list.size());


    }
    
}
