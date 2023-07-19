package Functions;
public class function_CheckPrime {




    // public static boolean isPrime(int n ){


    //     //corner cases
       
    //     //2
    //     if(n==2){
    //         return true;
    //     }

      
    //     for(int i = 2; i<=n-1;i++){
    //         if(n%i==0){ // completely dividing
    //             return false;
    //         }
    //     }
    //     return true;

    // }


    ///// Optimized Solution
    public static boolean isPrime(int n ){


        //corner cases
       
        //2 
        if(n==2){
            return true;
        }

      
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){ // completely dividing
                return false;
            }
        }
        return true;

    }


    public static void primesinRange(int n){
        for(int i = 2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");

            }

        }
        System.out.println();



    }
    public static void main(String[] args) {
        primesinRange(15);
       
    }
    
}
