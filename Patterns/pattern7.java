// 1
// 23
// 456
// 78910

public class pattern7{
    public static void main(String args[]){
        int n=4;
        int number=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}