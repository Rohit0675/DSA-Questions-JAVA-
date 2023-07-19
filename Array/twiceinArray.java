package Array;

public class twiceinArray {
    public static boolean Twice(int num[]){
        for(int i = 0 ; i< num.length; i++){
            for (int j = i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int num[] = {1,2,3,1,1,2,4,5,6,6,5,4};
        System.out.println(Twice(num));

       
    }
    
}
