

public class pattern18{
    public static void hollowRhombus(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<rows; j++){
                if(i==0 || i==(rows-1) || j==0 || j==(rows-1)){
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
        hollowRhombus(5);
    }
}