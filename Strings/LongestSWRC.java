
public class LongestSWRC {
    public static int LongestSubstring(String str){
        int n = str.length();

        int seen[] = new int[128];

        for(int i = 0;i < 128; i++){
            seen[i] = -1;
        }

        int left = 0;
        int maxlength = 0;

        for(int right = 0; right < n; right++){
            char currentChar = str.charAt(right);

            if(seen[currentChar] >= left){
                left = seen[currentChar] + 1;
            }
            
            seen[currentChar] = right;
            maxlength = Math.max(maxlength, right - left + 1);
        }
        
        return maxlength;
    
    }
    public static void main(String[] args){

        String str = "pwwkew";
        int len = LongestSubstring(str);
        System.out.println("Length of Longest Substring without repeating Characters is: " + len );
    }
}