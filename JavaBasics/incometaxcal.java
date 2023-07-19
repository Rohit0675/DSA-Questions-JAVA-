import java.util.*;
public class incometaxcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income(In lakhs): ");
        float income = sc.nextFloat();
        double tax;
        if(income<5){
            tax = 0;
           
        } else if(income>=5 && income<=10){
            tax = income*0.2;
            
        }else{
            tax = income*0.3;
        }
        System.out.println("your Tax is "+tax);

        sc.close();
    }
    
}
