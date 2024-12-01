public class binarySubStrings{
    public static void printBinaryStrings(int N, int i, StringBuilder sb){
        if(i==N){
            System.out.print(sb+" ");
            return;
        }
        //Yes
        printBinaryStrings(N, i+1, sb.append(0));
        sb.deleteCharAt(sb.length()-1);
        //No
        printBinaryStrings(N, i+1, sb.append(1));
        sb.deleteCharAt(sb.length()-1);
    }
    public static void main(String args[]){
        int N = 4;
        printBinaryStrings(N, 0, new StringBuilder(""));
    }
}