package Recursion;



public class Tiling {
    public static int numberofWays(int n){ // 2 x n (floor size)
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int verticalTiles = numberofWays(n-1);
        // horizontal choice
        int horizontalTiles = numberofWays(n-2);

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(numberofWays(10));
    }
}
