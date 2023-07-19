package Backtracking;

public class subsets {
    public static void findSubset(String str, String ans, int i ){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
           return;
        }


        //recusion
        //yes
        findSubset(str, ans+str.charAt(i), i+1);
        //no
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abcmnp";
        findSubset(str, "", 0);
    }
    
}
