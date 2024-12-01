//     A 
//    ABC
//   ABCDE 
//  ABCDEFG
// ABCDEFGHI
//  ABCDEFG     
//   ABCDE
//    ABC
//     A

public class pattern12{
    public static void main(String args[]){
        int n=5;
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            char ch = 'A';
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=(2*i)-1; j>0; j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}