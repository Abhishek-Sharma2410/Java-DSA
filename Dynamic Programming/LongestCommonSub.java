

public class LongestCommonSub{
    // This is the solution for this problem using recursion and this is giving TLE on input size 1000
    public static int lcs(String str1, String str2, int n, int m){
        if(n==0 || m==0) return 0;
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1) + 1;
        }
        else{
            return Math.max(lcs(str1, str2, n-1, m), lcs(str1, str2, n, m-1));
        }
    }
    public static int lcsMemoization(String str1, String str2, int n, int m, int dp[][]){
        if(n==0 || m==0) return 0; 
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
           return dp[n][m] = lcsMemoization(str1, str2, n-1, m-1, dp) + 1;
        }
        else{
            return dp[n][m] = Math.max(lcsMemoization(str1, str2, n-1, m, dp), lcsMemoization(str1, str2, n, m-1, dp));
        }
    }
    public static void init(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
    }
    public static int lcsTabulation(String str1, String str2){
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0; i<str1.length(); i++){
            dp[i][0] = 0;
        }
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    public static void main(String args[]){
        String str = "abcde";
        String str2 = "ace";
        int n = str.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        init(dp);
        // System.out.println(lcsMemoization(str, str2, n, m, dp));
        System.out.println(lcsTabulation(str, str2));
    }
}