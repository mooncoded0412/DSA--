import java.util.Arrays;

public class RotateAMatrix {

    public void rotate(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        //Transpose the matrix
        for(int row = 0; row < n; row ++){
            for(int col = 0; col < m; col ++){
                if (row < col){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }

        //Reverse every row to complete the clockwise rotation
        for(int row = 0; row < n; row ++){
            reverseRow(matrix[row]);
        }
    }

    private void reverseRow(int[] row){
        int start = 0;
        int end = row.length - 1;

        while(start < end){
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    // instance for class RotateAMatrix
    RotateAMatrix sol = new RotateAMatrix();

    sol.rotate(matrix);
    printMatrix(matrix);
}
    private static void printMatrix(int[][] matrix) {
        // Print each row in array form.
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

