public class question2{
    public static void numberCombinations(char numberCombinations[][], String num, StringBuilder sb){
        if(sb.length()==num.length()){
            System.out.println(sb);
            return;
        }
        // numberCombinations(numberCombinations, num, sb.append());
    }
    public static void main(String args[]){
        String num = "23";
        char numberCombinations[][] = {{' '}, {'n'}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        numberCombinations(numberCombinations, num, new StringBuilder());
    }
}