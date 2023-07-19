package Arrays_2D;

public class PracQue3 {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}};

        int row = 2, col = 3;
        Print(matrix);

        int transpose[][] = new int[col][row];
        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        Print(transpose);
        
    }

    public static void Print(int matrix[][]){
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        

    }
    
}
