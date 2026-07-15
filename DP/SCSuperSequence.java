public class SCSuperSequence {
    public static int SCS(String a[], String b[], int m, int n){
        return m + n - LCS(a, b, m, n);
    }
    public static int LCS(String a[], String b[], int m, int n){
        int t[][] = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i ++){
            for(int j = 1; j <= n; j ++){
                if(a[i - 1].equals(b[j - 1])){
                    t[i][j] = 1 + t[i - 1][j - 1];
                }else{
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }
    public static void main(String args[]){
        String a[] = {"A", "G", "G", "T", "A", "B"};
        String b[] = {"G", "X", "T", "X", "A", "Y", "B"};
        int m = a.length;
        int n = b.length;

        System.out.println(SCS(a,b,m,n));
    }
}
