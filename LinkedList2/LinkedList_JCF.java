package LinkedList2;
import java.util.LinkedList;

public class LinkedList_JCF {

public static void main(String[] args) {
    //create a ll
    LinkedList<Integer> ll = new LinkedList<>();
    //add
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    System.out.println(ll);
    //remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
}

    
    
}
