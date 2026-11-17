import java.util.*;

class Intersection {
    public List<Integer> intersection(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;

        int i = 0, j = 0;

        List<Integer> result = new ArrayList<>();

        while(i < n && j < m){
            // the smaller value cant match later values.
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            //Add the common value to the result if it is not already present in the result list.
            else{
                if(result.isEmpty() || result.get(result.size() - 1) != nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 2, 4, 5};

        Intersection intersection = new Intersection();
        List<Integer> answer = intersection.intersection(nums1, nums2);

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}

