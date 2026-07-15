public class MinInsDel {
    public static int[] MinInsDel(String a[], String b[], int m, int n){
        int lcs = LCS(a, b, m, n);
        int deletions = m - lcs;
        int insertions = n - lcs;
        
        return new int[] {deletions, insertions};
    }

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
    public static void main(String args[]){
        String a[] = {"h", "e", "a", "p"};
        String b[] = {"p", "e", "a"};
        int m = a.length;
        int n = b.length;
        int res[] = MinInsDel(a, b, m, n);

        System.out.println("Deletions :" + res[0]);
        System.out.println("Insertions :" + res[1]);
    }
}
