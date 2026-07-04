public class MinSubsetSumDiff {
    public static int minSubsetSumDifference(int arr[], int n){
        
        int range = 0;
        for(int num : arr){
            range += num;
        }

        int target = range / 2;
        boolean[][] t = new boolean[n + 1][target + 1];

        //initialize base cases
        for(int i = 0; i <= n;i ++){
           t[i][0] = true;
        }

        for(int j = 1; j <= target; j ++){
            t[0][j] = false;
        }

        // fill the DP Table (standard Subset sum logic)
        for(int i = 1; i <= n ; i ++){
            for(int j = 0; j<= target; j ++){
                if(arr[i - 1] <= j){
                    //include the element or exclude the element
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        //find the largest possible subset sum s1 that is  <= range / 2
        int s1 = 0;
        for(int j = target; j >= 0; j --){
            if(t[n][j]){
                s1 = j;
                break;
            }
        }

        // difference = (s2 - s1) => (range - s1) - s1 => range - 2 * s1
        return range - (2 * s1);
    }
    
    public static void main(String[] args){
       int arr[] = {2, 3, 20};
       int n = arr.length;
     
       System.out.println("The minimum subset sum difference is: " + minSubsetSumDifference(arr, n));

    }
    
}