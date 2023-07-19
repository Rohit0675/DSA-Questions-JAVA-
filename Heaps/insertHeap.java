package Heaps;

import java.util.ArrayList;

public class insertHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1; // x is child index

            int par = (x - 1) / 2;// parent index

            while(arr.get(x)<arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }

        }
    }
    public static void main(String[] args) {
        
    }

}
