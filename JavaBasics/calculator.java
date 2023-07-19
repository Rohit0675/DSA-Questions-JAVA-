import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("Choose Operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a+b);
                        break; 
            case '*' : System.out.println(a*b);
                        break;      
            case '/' : System.out.println(a/b);
                        break;  
            case '%' : System.out.println(a%b);
                        break;               
            default : System.out.println("Worng Operator");           
        }
        sc.close();
    }
}
