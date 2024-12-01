        //    1
  		//   121
 		//  12321
		// 1234321

public class pattern8{
    public static void main(String args[]){
        int n=4;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}