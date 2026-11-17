import java.util.List;
import java.util.*;


public class SpiralTraversal {

    public List<Integer> spiralOrder(int[][] matrix){
        //an empty matrix has no cells to reverse
        if(matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
            // return List.of(); // what is this ? this is a new feature in java 9, it returns an immutable list
        }

        List<Integer> order = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){
            //Traverse the current top row from left to right
            for(int col = left; col <= right; col ++){
                order.add(matrix[top][col]);
            }
            top ++;
            //Traverse the current right column from top to bottom
            for(int row = top; row <= bottom; row ++){
                order.add(matrix[row][right]);
            }
            right --;
            //Traverse the current bottom row from right to left, if there is a bottom row remaining
            if(top <= bottom){
                for(int col = right; col >= left; col --){
                    order.add(matrix[bottom][col]);
                }
                bottom --;
            }
            //Traverse the current left column from bottom to top, if there is a left column remaining 
            if (left <= right){
                for(int row = bottom; row >= top; row --){
                    order.add(matrix[row][left]);
                }
                left ++;
            }
        }
        return order;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        // instance for class Solution
        SpiralTraversal sol = new SpiralTraversal();

        List<Integer> result = sol.spiralOrder(matrix);
        System.out.println(result);// Output: [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
    }
}
