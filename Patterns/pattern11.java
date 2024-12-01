// 123456787654321
// 1234567 7654321
// 123456   654321
// 12345     54321
// 1234       4321
// 123         321
// 12           21
// 1             1

public class pattern11{
    public static void main(String args[]){
        int n=8; 
        for(int i=0; i<n; i++){
            int number=1;
            for(int j=n-i; j>0; j--){
                System.out.print(number);
                number++;
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i-1; j++){
                if(i==1){
                    continue;
                }
                System.out.print(" ");
            }
            for(int j=n-i; j>0; j--){
                if(j==8){
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}