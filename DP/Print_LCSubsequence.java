public class Print_LCSubsequence {
    public static String printLCS(String a[], String b[], int m, int n){
        int t[][] = new int[m + 1][n + 1];

        // build standard Dp tabulation
        //StringBuilder lcs = new StringBuilder();
        for(int i= 1; i <= m; i ++){
            for(int j = 1; j <= n; j ++){
                if(a[i - 1].equals(b[j - 1])){
                    t[i][j] = 1 + t[i - 1][j - 1];
                }
                else{
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        StringBuilder lcs = new StringBuilder();
       //backtrack from t[m][n] to build the result String
        int i = m, j = n;
        while(i > 0 && j > 0){
            if(a[i - 1].equals(b[j - 1])){
                lcs.append(a[i - 1]);
                i --;
                j --;
            }
            else if(t[i - 1][j] > t[i][j - 1]){
                i --;
            }
            else{
                j --;
            }
        }

        return lcs.reverse().toString();
    }
    public static void main(String args[]){
        String a[] = {"a", "b", "c", "d", "g", "h"};
        String b[] = {"a", "b", "e", "d", "g", "h", "r"};
        int m = a.length;
        int n = b.length;

        System.out.println(printLCS(a, b, m, n));
    }
}
