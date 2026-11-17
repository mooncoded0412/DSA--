import java.util.Arrays;

public class NextPermutation {
    public void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    public void NextPermuatation(int nums[]){
        int n = nums.length;

        //a single value vant move to a different permutation.
        if(n <= 1){
            return;
        }

        int pivot = n - 2;

        //search for the rightmost element position that is smaller than its next element. This is the pivot point where we can swap to get a larger permutation.
        while(pivot >= 0 && nums[pivot] >= nums[pivot + 1]){
            pivot --;
        }
        
        //if pivot is less than 0, it means the entire array is descending and we are at the last permutation. we can reverse the entire array to get the first permuatation.
        if(pivot < 0){
            reverse(nums, 0, n - 1);
            return;
        }

        int successor = n - 1;

        while(nums[successor] <= nums[pivot]){
            successor --;
        }

        int temp = nums[pivot];
        nums[pivot] = nums[successor];
        nums[successor] = temp;

        reverse(nums, pivot + 1, n - 1);
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};

        // instance for class Solution
        NextPermutation sol = new NextPermutation();

        sol.NextPermuatation(nums);
        System.out.println(Arrays.toString(nums));
        //output: [2, 3, 0, 0, 1, 4, 5]
    }
}
