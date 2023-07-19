public class bintodeciml {


    public static void bintoDec(int n){
        int number = n;

        int pow = 0;
        int decNum = 0;

        while(n>0){
            int lastdigit = n%10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));


            pow++;
            n = n/10;
        }
        System.out.println("Decimal of "+ number+ " = "+decNum);
    }


    public static void main(String[] args) {
        bintoDec(101111);
        
    }



    }
    

