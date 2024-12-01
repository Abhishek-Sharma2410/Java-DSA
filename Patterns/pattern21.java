public class pattern21{
    public static void numberpattern(int n){
        int number =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(number+ " ");
            }
            number++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        numberpattern(5);
    }
}