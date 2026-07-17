public class MinDelforLPS {
    public static int LCS(String a[], String b[], int m, int n){
        int t[][] = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i ++){
            for(int j = 1; j <= n; j ++){
                if(a[i - 1].equals(b[j - 1])){
                    t[i][j] = 1 + t[i - 1][j - 1];
                }
                else{
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }
    public static int LPS(String a[]){

        int n = a.length;

        String rev[] = new String[n];

        for(int i = 0; i < n; i ++){
            rev[i] = a[n - i - 1];
        }

        return LCS(a, rev, n, n);
    }
    public static int MinDels(String a[]){
        int n = a.length;

        int LPS = LPS(a);

        return n - LPS;
    }
    public static void main(String args[]){
        String a[] = {"a", "g", "b", "c", "b", "a"};
        
        System.out.println(MinDels(a));
    }
}
