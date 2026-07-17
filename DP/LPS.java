public class LPS {
    public static int LCS(String s[], String rev[], int m, int n){
        int t[][] = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j ++){
                if(s[i - 1].equals(rev[j - 1])){
                    t[i][j] = 1 + t[i - 1][j - 1];
                }else{
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        return t[m][n];
    }
    public static int LPS(String s[]){
        int n = s.length;
        String rev[] = new String[n];
        for(int i = 0; i < n; i++){
            rev[i] = s[n - i - 1];
        }

        return LCS(s, rev, n, n);

    }
    public static void main(String args[]){
        String a[] = {"a", "b", "g", "c", "b", "a"};
        System.out.println(LPS(a));
    }
}
