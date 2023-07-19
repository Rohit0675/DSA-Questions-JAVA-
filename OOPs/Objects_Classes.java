package OOPs;



public class Objects_Classes {
    public static void main(String[] args) {
        Pen p1 = new Pen();///created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Rohit Talmale";
        // myAcc.password = "123456";
        
    }
    
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
    return this.color;

    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//         }
//     }

// class Student{
//     String name;
//     int age;
//     float percentage; //cgpa

//     void calcPercentage(int phy, int maths, int chem){
//         percentage = (phy+maths+chem)/3;
//     }

//     }


