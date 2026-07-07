public class UnboundedKnapsack {
    public static int RodCutting(int length[], int price[], int n){
        int t[][] = new int [n + 1][n + 1];

        for(int i = 0; i < n + 1; i ++){
            t[i][0] = 0;
        }
        for(int j = 0; j < n + 1; j ++){
            t[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i ++){
            for(int j = 1; j < n + 1; j ++){
                if(length[i - 1] <= j){
                    t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][n];
    }
    public static void main(String args[]){
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        System.out.println(RodCutting(length, price, n));
    }
}
