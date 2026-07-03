public class EqualSumPartition{
    public static Boolean SubsetSum(int arr[], int sum, int n){
        
        // if sum is 0 then we can always have an empty subset
        if(sum == 0){
            return true;
        }

        // if sum is not zero and set is empty then we return false
        if(n == 0 && sum != 0){
            return false;
        }

        // if last element is less than or equal to sum then we have 2 choices eitehr we include last element or we dont and take the OR of both choices
        if(arr[n - 1] <= sum){
            return SubsetSum(arr, sum - arr[n - 1], n - 1) || SubsetSum(arr, sum, n - 1);
        }
        else{
            return SubsetSum(arr, sum, n - 1);
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 5, 11, 5};
        int sum = 0;

        for(int i = 0;i < arr.length; i ++){
            sum += arr[i];
        }

        if (sum % 2 != 0){
            System.out.println("false");
        }
        else{
            sum = sum / 2;
            int n = arr.length;
            System.out.println(SubsetSum(arr, sum, n));
        }
    }
}