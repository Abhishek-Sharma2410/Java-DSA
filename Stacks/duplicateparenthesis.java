import java.util.Stack;
public class duplicateparenthesis{
    public static boolean duplicateParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            if(letter!=')'){
                s.push(letter);
            }
            else{
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b) + (c+d))";
        System.out.println(duplicateParenthesis(str));
    }
}