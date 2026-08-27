import java.util.HashMap;

public class test {
    public static void main(String args[]){
        int nums[] = {1, 0, 1, 0, 1};
        int goal = 2;

        int count = 0;
        int ps = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int i = 0; i < nums.length; i ++){
            ps += nums[i];

            if(map.containsKey(ps - goal)){
                count += map.get( ps - goal);
            }

            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }

        System.out.println(count);

    }
}
