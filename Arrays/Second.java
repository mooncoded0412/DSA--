public class Second{
    public static void main(String[] args){
        int [] arr = {2, 5, 1, 3, 9};
        int n = arr.length;
        int secondmax = Integer.MIN_VALUE;
        int max = arr[0];

        for(int i = 1;i < n;i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];
            }
        }
        System.out.println("The second largest number in the array is: "+ secondmax);
        System.out.println("The largest number in the array is:"+max);
    }
}