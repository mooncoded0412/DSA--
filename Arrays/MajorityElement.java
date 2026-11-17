import java.util.*;

public class MajorityElement {
    public List<Integer> majorityElement(int nums[]){
        int el1 = nums[0];
        int el2 = nums[0];
        int c1 = 0;
        int c2 = 0;

        //select at most 2 possible candidates through vote cancellations.
        for(int value : nums){
            if(value == el1){
                c1 ++;
            }
            else if(value == el2){
                c2 ++;
            }
            else if(c1 == 0){
                el1 = value;
                c1 = 1;
            }
            else if(c2 == 0){
                el2 = value;
                c2 = 1;
            }
            else{
                c1 --;
                c2 --;
            }
        }
        
        int cnt1 = 0;
        int cnt2 = 0;

        //count the real frequencies of the candidates.
        for(int value : nums){
            if(value == el1){
                cnt1 ++;
            }
            else if(value == el2){
                cnt2 ++;
            }
        }

        int threshold = nums.length / 3;
        List<Integer> ans = new ArrayList<>();

        if(cnt1 > threshold){
            ans.add(el1);
        }
        if(cnt2 > threshold){
            ans.add(el2);
        }

        return ans;
    }
     public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 1, 2, 4, 2, 1};

        // instance for class Solution
        MajorityElement sol = new MajorityElement();

        System.out.println(sol.majorityElement(nums));
        // Output: [1, 2]
    }
}
