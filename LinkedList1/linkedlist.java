package LinkedList1;

public class linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
         //step1 create new node
         Node newNode = new Node(data);
         size++;
        if(head == null){
            head = tail = newNode;
            return;

        }
       

        //newNode next = head // linking
        newNode.next = head;

        // head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == tail){
            head  = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void  add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty!");
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty!");
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev: i-size-2
        Node prev = head;
        for(int i =0; i<(size-2); i++){
            prev = prev.next;

        }
        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;


    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev = null;
        Node curr= tail = head;
        Node  next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        //calculate size
        int  sz = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
        }


        //sz-n to go on the node which is before the delete node

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;

        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Palindrome
    //slow-fast aproach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//return mid value
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node mid = findMid(head);
        //step2 - reverse 2nd half
        Node prev = null;
        Node curr= mid;
        Node  next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right head
        Node left = head;
        //check right == left
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){ // Floyd's Cycle F inder Algorithm
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;


    }

    public static void removeCycle(){

        //detect a cycle
        Node slow = head;
        Node fast = head;
        boolean cycle  = false;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }

        }
        if(cycle ==false){
            return;

        }



        //  find meeting point
        slow = head;
        Node prev = null;

        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle = last.next = null

        prev.next = null;
    }


///////// Merge Sort in LL///////////
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//return mid value

    }
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1!= null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!= null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }


    public Node mergeSort(Node head){
        if(head == null || head.next ==null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left & right merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    //////Zig- Zad LL

    public void zigZag(){
        ///find mid
        Node slow = head;
        Node fast = head.next;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        /// reverse 2nd half
        Node curr = mid.next;
        mid.next= null;
        Node prev= null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
        
    }
    
    

    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next =  temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        linkedlist ll = new linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //ll.addLast(6);


        // ll.addLast(3);
        // ll.addLast(1);
        // ll.add(0, 9);
        //print();
        // ll.removeFirst();
        // print();
        // ll.removeLast();
        // print();
        // System.out.println("Size of the linked-list is "+size);
        //print();
        //    System.out.println(ll.itrSearch(3));
        //    System.out.println(ll.itrSearch(11));
        // ll.reverse();
        // print();
        // ll.deleteNthFromEnd(2);
        // print();
        //System.out.println(ll.checkPalindrome());
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.zigZag();
        ll.print();
    }
    
    
}
