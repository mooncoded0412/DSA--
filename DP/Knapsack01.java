public class Knapsack01{
    /*
    Recursive implementation of KNAPSACK 0/1 problem
    public static int knapsack(int wt[], int val[], int W, int n){
        
        // Base Condidtion 
        if(n == 0 || W == 0){
        return 0;
        }

        // if weight of item is less than or equal to capacity then we have 2 choices either we include the item or we dont 
        if(wt[n-1] <= W){
            return Math.max((val[n-1] + knapsack(wt, val, W - wt[n-1], n-1)),knapsack(wt, val, W, n-1));
        }

        // if the weight of item is greater than capacity then we dont include the item and move on to next item 
        else{
            return knapsack(wt, val, W, n-1);
        }
    }
    
    static int dp[][];

    // MEMOIZATION CODE
    public static int knapsack(int wt[], int val[], int W, int n){
        //Base Condidtion
        if(n == 0 || W == 0){
            return 0;
        }

        //if the value is already calculated then return the value from the dp array 
        if(dp[n][W] != -1){
            return dp[n][W];
        }

        //if thw weight of item is less than or equal to capacity then we have 2 choices either we include the item or we dont
        if(wt[n - 1] <= W){
            return dp[n][W] = Math.max((val[n - 1] + knapsack(wt, val, W - wt[n-1], n - 1)),knapsack(wt, val, W, n - 1));
        }

        // if the weight of item is greater than capacity then we dont include the item and move on to next item 
        else{
            return dp[n][W] = knapsack(wt, val, W, n - 1);
        }
    }
    
    */
    
    // TABULATION CODE 
    public static int knapsack(int wt[], int val[], int W, int n){

        int dp[][] = new int[n + 1][W + 1];

        //Base Condition
        /*
        can be omitted in java as arrays are initialized to 0 by default
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < W + 1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }*/

        // Choice Diagram
        for(int i = 1; i < n + 1; i ++){
            for(int j = 1; j < W + 1; j++){

                // if the weight of item is less than or equal to capacity j then we have 2 choices either we include the item or not . we choose the max of 2 choices
                if(wt[i - 1] <= j){
                    dp[i][j] = Math.max((val[i - 1] + dp[i - 1][j - wt[i - 1]]), dp[i - 1][j]);
                }
                // if the weight of item is greater than capacity then we do not include the item and move on to next item
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args){
        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        int n = wt.length;

        // dp = new int[n + 1][W + 1];

        //int dp[][] = new int[n + 1][W + 1];

        int maxprofit = knapsack(wt, val, W, n);
        System.out.println("MaxProfit = "+maxprofit);
    }
}