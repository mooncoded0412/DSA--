import java.util.Arrays;

public class Sort012s {
    public void sortColors(int nums[]){
       int low = 0;
       int mid = 0;
       int high = nums.length - 1;
       int temp = 0;
       while(mid <= high){
        // if element is 0, swap it with the element at low pointer and incremenet both low and mid pointers because we know that the element at low pointer is already sorted and we can move on to the next element.
        if(nums[mid] == 0){
            temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            low ++;
            mid ++;
        }
        // if element is 1, we can just move on to the next element because we know that the element at mid pointer is already sorted and we can move on to the next element.
        else if(nums[mid] == 1){
            mid ++;
        }
        // if element is 2, swap it with the element at high pointer and decrement the high pointer because we know that the element at high pointer is already sorted and we can move on to the next element.we cant increment the mid pointer because we dont know what the element at mid pointer is after the swap, so we need to check it again.
        else{
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high --;
        }
       }
    }
     public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        // instance for class Solution
        Sort012s sol = new Sort012s();

        sol.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
