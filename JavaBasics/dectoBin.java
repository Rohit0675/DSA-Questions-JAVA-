public class dectoBin {


    public static void DectoBin(int n){
        int number = n;
        int binNum = 0;
        int pow = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem* (int)Math.pow(10, pow));
            pow++;
            n = n/2;


        }
        System.out.println("Binary of "+number+" is "+binNum);



    }
    public static void main(String[] args) {
        DectoBin(5);
    }
    
}
