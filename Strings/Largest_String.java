package Strings;

public class Largest_String {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }

        }
        //lexicographically largest
        System.out.println(largest);
    }
    
}
