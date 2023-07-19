package Divide_Conquer;

public class searchIn_sortedArray {
    public static int search(int arr[], int tar, int si, int ei ){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        // found on line 1
        if(arr[si]<= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar<= arr[mid]){
                return search(arr, tar, si, mid-1);
                
            }else{
                //right
                return search(arr, tar, mid+1, ei);
            }

        }
        // found on line 2
        else{
            // case c: right
            if(arr[mid] <= tar && tar<= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2};
        int target = 6;
       System.out.println( "Target found at: "+search(arr, target, 0, arr.length-1));
    }
    
}
