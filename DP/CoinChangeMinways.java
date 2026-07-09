public class CoinChangeMinways {
    public static int Minways(int coins[], int sum){
        int n = coins.length;
        int t[][] = new int[n + 1][sum + 1];

        for(int i = 0; i <= sum; i ++){
            t[0][i] = Integer.MAX_VALUE - 1;
        }

        for(int i = 0;i <= n; i ++){
            t[i][0] = 0;
        }

        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= sum; j ++){
                if(coins[i - 1] <= j){
                    t[i][j] = Math.min(1 + t[i][j - coins[i - 1]], t[i - 1][j]);
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum] >= Integer.MAX_VALUE - 1 ? -1 : t[n][sum];
    }
    public static void main(String args[]){
        int coins[] = {1, 2, 3};
        int sum = 5;
        System.out.println(Minways(coins, sum));
    }
}
