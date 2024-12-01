public class gridways{
    public static int totalGridWays(int n, int m, int i, int j){
        if(i==n-1 || j==m-1) return 1;
        return totalGridWays(n, m, i, j+1)+totalGridWays(n, m, i+1, j);
    }
    public static void main(String args[]){
        int n = 4, m = 4;
        System.out.println(totalGridWays(n, m, 0, 0));
    }
}