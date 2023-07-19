package Strings;
import java.util.*;


public class Basics {
    public static void main(String[] args) {
        char arr[] = {'a','b','c'};
        String str = "abcd";
        System.out.println(arr);
        System.out.println(str);
        //input-output
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        //length
        String Name = "Rohit Talmale";
        System.out.println(Name.length());
        //concatenation
        String firstName = "Rohit";
        String lastName = "Talmale";
        String fullName = firstName + " "+lastName;
        System.out.println(fullName.charAt(0));


        sc.close();

    }
    
}
