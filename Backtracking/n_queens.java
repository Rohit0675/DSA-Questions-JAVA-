package Backtracking;



public class n_queens {

    public static boolean isSafe(char board[][] , int row, int col){
        //vertically up
        for(int i = row-1; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }

        }
        //diagonally left up
        for(int i= row-1,  j = col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonally right up
        for(int i= row-1,  j = col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static int count = 0;
    public static boolean nQueens(char board[][], int row){
        if(row == board.length){
            // printArray(board);
            count++;
            return true;
        }
        


        //column loop
        for(int j =0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
            if(nQueens(board, row+1)){
                return true;
            }
            board[row][j] = 'x';
            }
            
        }
        return false;
        
    }


    public static void printArray(char board[][]){

        System.out.println("-------Chess Board-------");
        for(int i =0; i<board.length; i++){
            for(int j = 0;j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n = 0;
        char board[][] = new char[n][n];
        

        //initialize
        for(int i = 0; i <board.length; i++){
            for(int j = 0; j<board.length;j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printArray(board);
        }else{
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total number of ways: "+ count);
        // nQueens(board, 0);
        
    }
    
}
