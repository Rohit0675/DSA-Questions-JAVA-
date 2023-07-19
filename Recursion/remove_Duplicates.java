package Recursion;

public class remove_Duplicates {
    public static void afterRemoval(String str, int index, StringBuilder newStr, boolean map[]){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            // duplicate
            afterRemoval(str, index+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            afterRemoval(str, index+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
       afterRemoval(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
  