package Array;

public class linearSearch {
    public static int linearsearch(int num[], int key){
        for(int i = 0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 85;

        int index = linearsearch(num, key);
        if(index == -1){
            System.out.print("Not found");
        }else{
            System.out.print("Key Found at Index: " + index);
        }

        System.out.println();
    }
    
}
