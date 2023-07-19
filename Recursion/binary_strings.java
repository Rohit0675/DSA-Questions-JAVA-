package Recursion;

public class binary_strings {
    public static void binayStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0 ){
        //     // sit 0 on chair n
        //     binayStrings(n-1, 0, str.append("0"));
           
        //     binayStrings(n-1, 1,str.append("1"));
        // }else{
        //     binayStrings(n-1, 0, str.append("0"));

        // }
        binayStrings(n-1, 0, str+"1");
        if (lastPlace == 0){
            binayStrings(n-1, 1, str+"0");
        }

    }
    public static void main(String[] args) {
        binayStrings(3, 0, "");
    }
    
}
