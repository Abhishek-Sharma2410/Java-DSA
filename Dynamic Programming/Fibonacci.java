public class Fibonacci{
    public static int fibonacci(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){ //The value of that particular n is been calculated
            return dp[n];
        }
        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return dp[n];
    }
    public static int dpTabulation(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void dpPrint(int dp[]){
        for(int i=0; i<dp.length; i++){
            System.out.print(dp[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n = 6;
        int dp[] = new int[n+1];
        System.out.println(fibonacci(n, dp));
        dpPrint(dp);
        System.out.println(dpTabulation(n));
    }
}