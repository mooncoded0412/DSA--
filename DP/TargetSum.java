public class TargetSum {
    
    public static int SubsetSum(int arr[], int sum, int n){
       
        int t[][] = new int[n + 1][sum + 1];

        for(int i = 0; i <= n; i ++){
            t[i][0] = 1;
        }

        for(int i = 1; i < n + 1; i ++){
            for(int j = 0; j < sum + 1; j ++){
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
        int arr[] = {1, 1, 2, 3}; // op : 3

        int sum = 1;
        int arrsum = 0;
        int n = arr.length;

        for(int num : arr){
            arrsum += num;
        }

        if((sum + arrsum) % 2 != 0 || sum > arrsum){
            System.out.println(0);
        }
        else{
            int Tsum = (sum + arrsum) / 2;
            System.out.println(SubsetSum(arr, Tsum, n));
        }


    }
}
/*public static int SubsetSum(int arr[], int sum, int n) {
    int t[][] = new int[n + 1][sum + 1];

    for case : {0, 0, 1}, diff = 1 op : 4
    // Base Case: 1 way to make sum 0 (empty set)
    t[0][0] = 1;
    
    // Initialize first row: 0 ways to make sum > 0 with 0 elements
    for (int j = 1; j <= sum; j++) {
        t[0][j] = 0;
    }

    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= sum; j++) { // j starts at 0 now!
            if (arr[i - 1] <= j) {
                t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
            } else {
                t[i][j] = t[i - 1][j];
            }
        }
    }
    return t[n][sum];
} */