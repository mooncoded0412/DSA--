public class LCS{
    /* 
    //Recursive approach
    public static int LCS(String[] x, String[] y, int m, int n){
        if(m == 0|| n == 0){
            return 0;
        }
        if(x[m - 1].equals(y[n - 1])){
            return 1 + LCS(x, y, m - 1, n - 1);
        }
        else{
            return Math.max(LCS(x, y, m, n - 1), LCS(x, y, m - 1, n));
        }
    }*/
    
    static int t[][];

        //Memoization Approach
    public static int LCS(String[] x, String[] y, int m, int n){
        //Base case
        if(m == 0 || n == 0){
            return 0;
        }

        //check if this state was already calculated
        if(t[m][n] != -1){
            return t[m][n];
        }

        //calculate: compute and store result
        if(x[m - 1].equals(y[n - 1])){
            return t[m][n] = 1 + LCS(x, y, m - 1, n - 1);
        }
        else{
            return t[m][n] = Math.max(LCS(x, y, m, n - 1), LCS(x, y, m - 1, n));
        }
    }

        public static void main(String args[]){
        String x[] = {"a", "b", "c", "d", "g", "h"};
        String y[] = {"a", "b", "e", "d", "g", "h", "r"};
        int m = x.length;
        int n = y.length;

        t = new int[m + 1][n + 1];

        for(int i = 0; i <= m;i ++){
            for(int j = 0; j <= n; j ++){
                t[i][j] = -1;
            }
        }

        System.out.println(LCS(x, y, m, n));
    }
}