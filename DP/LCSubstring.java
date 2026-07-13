public class LCSubstring {
    public static int LCS(String a[], String b[], int m, int n){
        int t[][] = new int[m + 1][n + 1];
        int maxLength = 0;

        for(int i = 1; i <= m; i ++){
            for(int j = 1; j <= n; j ++){
                if(a[i - 1].equals(b[j - 1])){
                    t[i][j] = 1 + t[i - 1][j - 1];
                    maxLength = Math.max(t[i][j], maxLength);
                }else{
                    t[i][j] = 0;
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        String a[] = {"a", "b", "c", "d", "e"};
        String b[] = {"a", "b", "f", "c", "e"};
        int m = a.length;
        int n = b.length;

        System.out.println(LCS(a, b, m, n));
    }
}
