package Array;

public class reverseArray {
    public static void Reversearray(int numbers[]){
        int first = 0,  last = numbers.length-1;

        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;  
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        

    Reversearray(numbers);
    //print
    for(int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i]+" ");
    }
    }
    
}
