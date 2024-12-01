public class factorial{
    public static long factorial(int n){
        if(n==1){
            return 1;
        }
        long fnm1 = factorial(n-1);
        long fn = n * fnm1;
        return fn;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.print(factorial(n));
    }
}