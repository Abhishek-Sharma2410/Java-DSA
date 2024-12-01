public class question2{
    public static void printNumberWords(String str, int i, StringBuilder sb){
        String numberWords[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        Integer number = Character.getNumericValue(str.charAt(i));
        sb.append(numberWords[number]);
        sb.append(" ");
        printNumberWords(str, i+1, sb);
    }
    public static void main(String args[]){
        printNumberWords("2019", 0, new StringBuilder(""));
    }
}