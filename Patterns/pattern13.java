// *****
// *   *
// *   *
// *****

public class pattern13{
    public static void hollow_pattern(int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || i==rows-1 || j==0 || j==cols-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_pattern(4, 5);
    }
}