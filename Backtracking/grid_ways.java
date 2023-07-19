package Backtracking;

public class grid_ways {
    public static int ways(int i, int j , int n, int m){
        if(i == n-1 && j == m-1){ // condition for last cell
            return 1;
        }
        else if(i == n  || j ==m) {//boundary condition
            return 0;
        }

        int w1 = ways(i+1, j, n, m);
        int w2 = ways(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n =10,  m =40;
        
        System.out.println(ways(0, 0, n, m));
    }
    
}
