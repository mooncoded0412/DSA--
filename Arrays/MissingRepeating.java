public class MissingRepeating {
    public int[] findNumbers(int[] nums){
        int n = nums.length;
        long actualSum = 0;
        long actualSquareSum = 0;

        for(int value : nums){
            actualSum += value;
            actualSquareSum += (long)value * (long)value;
        }

        long expectedSum = n * (n + 1) / 2;
        long expectedSquareSum = n * (n + 1) * (2 * n + 1) / 6;
        long difference = actualSum - expectedSum;
        long SumOfAnswers = (actualSquareSum - expectedSquareSum) / difference;

        //use the sum and difference of the answers to find both numbers.
        long repeating = (difference + SumOfAnswers) / 2;
        long missing = SumOfAnswers - repeating;
        return new int[]{(int)missing, (int)repeating};
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        // instance for class Solution
        MissingRepeating sol = new MissingRepeating();
        int[] answer = sol.findNumbers(nums);
        System.out.println(answer[0] + " " + answer[1]);
        //Output: 4 3
    }
}
