public class SubsetSum{
    
   /* // Recursive approach
    public static boolean SubsetSum(int[] arr, int sum, int  n){
        //base case
        if(sum == 0){
            return true;
        }

        // if sum is not zero and set is empty 
        if(n == 0 && sum != 0){
            return false;
        }

        if(arr[n - 1] <= sum){
            return SubsetSum(arr, sum - arr[n - 1], n -1) || SubsetSum(arr, sum, n - 1);
        }
        else{
            return SubsetSum(arr, sum, n - 1);
        }
}*/
    static Boolean dp[][];
   //Memoization approach
   public static boolean SubsetSum(int[] arr, int sum, int n){

    // Base case
    if(sum == 0){
        return dp[n][sum] = true;
    }
    if(n == 0 && sum != 0){
        return dp[n][sum] = false;
    }

    if(dp[n][sum] != null){
        return dp[n][sum];
    }

    if(arr[n - 1] <= sum){
        boolean include = SubsetSum(arr, sum - arr[n - 1], n - 1);
        boolean exclude = SubsetSum(arr, sum, n - 1);

        return dp[n][sum] = (include || exclude);
    }
    else{
        return dp[n][sum] = SubsetSum(arr, sum, n - 1);
    }

   }

    /* Tabulation approach 
    public static boolean SubsetSum(int[] arr, int sum, int n){
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // if number of elements is 0 and sum is not 0 then we return False
        // we can skip this step as by default all values in boolean array are false
       /* for(int i = 0; i < sum + 1; i ++){
            dp[0][i] = false;
        }

        // if sum is 0 and number of elements is 0 then we return True
        for(int i = 0; i < n + 1; i ++){
            dp[i][0] = true;
        }
 
        // filling the dp array in bottom up manner 
        for(int i = 1; i < n + 1; i ++){
            for(int j = 1; j < sum + 1; j ++){
                // if number is less than or equal to sum then we have 2 choices either we include the number or we dont include the number and we take the OR of both choices
                if(arr[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                }
                // if number is greater than sum then we dont include the number and we take the value from the previous row
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        // returning the value of last cell of dp array which will tell us whether we can form the sum or not 
        return dp[n][sum]; 
    } */

   
    public static void main(String[] args){
        //int[] arr = {2, 3, 7, 8, 10}; true
        //int[] arr = {1, 2, 5, 9}; int sum = 13; // false
        //int[] arr = {3, 4, 5}; int sum = 0; // true 
        //int[] arr = {}; int sum = 5; // false 
        //int[] arr = {1, 2, 3}; int sum = 5; //true
        //int[] arr = {}; int sum = 0; // true
        //int[] arr = {6}; int sum = 6; // true
        //int[] arr = {12}; int sum = 9; // false
        int[] arr = {1, 2, 3, 10}; int sum = 16; // true
        //int sum = 11;
        int n = arr.length;

        dp = new Boolean[n + 1][sum + 1];
        

        System.out.println(SubsetSum(arr, sum, n));
    }
}