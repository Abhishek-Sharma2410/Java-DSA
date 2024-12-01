public class igniteseries{
    public static int nthIgniteNumber(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        return nthIgniteNumber(n-2) + nthIgniteNumber(n-3);
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(nthIgniteNumber(n));
    }
}