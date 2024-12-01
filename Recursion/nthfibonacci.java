public class nthfibonacci{
    public static int nthfibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return nthfibonacci(n-1) + nthfibonacci(n-2);
    }
    public static void main(String args[]){
        System.out.println(nthfibonacci(10));
    }
}