public class tiling{
    public static int tilingProblem(int n){
        if(n==0 || n==1) return 1;
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(tilingProblem(n));
    }
}