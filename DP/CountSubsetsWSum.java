public class CountSubsetsWSum {

    public static int CountSubsets(int arr[], int n, int sum){
        int t[][] = new int[n + 1][sum + 1];

        for(int i = 0; i <= n; i ++){
            t[i][0] = 1; 
        }

        for(int i = 1; i< n + 1; i ++){
            for(int j = 1; j < sum + 1; j ++){
                if(arr[i - 1] <= j){
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } 
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        
        return t[n][sum];
    }
    public static void main(String[] args){
        int arr[] = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = arr.length;

        System.out.println(CountSubsets(arr, n ,sum));
    }
}