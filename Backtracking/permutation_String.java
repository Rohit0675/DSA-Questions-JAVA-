package Backtracking;

public class permutation_String {
    public static void permutations(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        //recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" = if remove c "ab" + "de"
            String NewString = str.substring(0, i) + str.substring(i+1);
            permutations(NewString, ans + curr);
        }

    }
    public static void main(String[] args) {
       String str = "abc";
       permutations(str, "");
    }
    
}
