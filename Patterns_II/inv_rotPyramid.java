package Patterns_II;

public class inv_rotPyramid {
    public static void Pyramid(int totRows){
        for(int i = 1; i <=totRows; i++  ){
           for(int j = 1; j<= totRows -i; j++){
            System.out.print(" ");
           }
           for( int j = 1; j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }
      

    }

    public static void main(String[] args) {
        
        Pyramid(4);
    }
    
}
