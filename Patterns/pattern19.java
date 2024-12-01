public class pattern19{
    public static void diamondPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamondPattern(4);
    }
}