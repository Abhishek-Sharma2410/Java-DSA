public class pattern16{
    public static void butterflyPattern(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(rows-i)-2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        butterflyPattern(4);
    }
}