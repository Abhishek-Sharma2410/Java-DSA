public class binaryStrings{
    public static void printBinaryStrings(int N, int i, StringBuilder sb){
        if(i==N){
            System.out.println(sb);
            return;
        }
        
    }
    public static void main(String args[]){
        int N = 4;
        StringBuilder sb = new StringBuilder("");
        printBinaryStrings(N, 0, sb);
    }
}