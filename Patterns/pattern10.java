// 1234554321
// 1234  4321
// 123    321
// 12      21 
// 1        1

public class pattern10{
    public static void main(String args[]){
        int n=5;
        for(int i=0; i<n; i++){
            int number=1;
            for(int j=n-i; j>0; j--){
                System.out.print(number);
                number++;
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=n-i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}