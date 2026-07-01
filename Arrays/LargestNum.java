public class LargestNum{
    public static void main(String[] args){
        int [] arr = {2, 5, 1, 3, 0};
        int n = arr.length;
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest number in the array is: "+ max);
    }
}