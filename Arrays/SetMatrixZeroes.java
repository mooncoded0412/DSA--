import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 0 || cols == 0){
            return;
        }

        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        // check if teh first row must be cleared later
        for(int col = 0; col < cols; col++){
            if(matrix[0][col] == 0){
                firstRowZero = true;
            }
        }

        //check if the first column must be cleared later
        for(int row = 0; row < rows; row ++){
            if(matrix[row][0] == 0){
                firstColZero = true;
            }
        }

        // store row and column markers inside the first row and first column
        for(int row = 1; row < rows; row ++){
            for(int col = 1; col < cols; col ++){
                if(matrix[row][col] == 0){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        //Apply markers to inner part of the matrix
        for(int row = 1; row < rows; row ++){
            for(int col = 1; col < cols; col ++){
                // if either the row or column is marked, set the cell to zero
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
        }

        //the saved first row status decides whether the first row is cleared.
        if(firstRowZero){
            for(int col = 0; col < cols; col ++){
                matrix[0][col] = 0;
            }
        }

        // the saved first column status decides whether the first column is cleared.
        if(firstColZero){
            for(int row = 0; row < rows; row ++){
                matrix[row][0] = 0;
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0, 4},
            {5, 6, 7, 8},
            {9, 0, 11, 12},
            {13, 14, 15, 16}
        };

        //output is = 

        // instance for class Solution
        SetMatrixZeroes sol = new SetMatrixZeroes();
        sol.setZeroes(matrix);
        printMatrix(matrix);
    }

    // Prints the matrix rows.
    private static void printMatrix(int[][] matrix) {
        // Print each row on a separate line.
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
